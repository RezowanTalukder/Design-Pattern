package apriori ;

import java.io.*;
import java.util.*;

public class Apriori extends Observable {

    private List<int[]> itemsets ;
    private String transaFile; 
    private int numItems; 
    private int numTransactions; 
    private double minSup; 
    
    private boolean usedAsLibrary = false;

    public  Apriori(String transaFile, double minSup) throws Exception
    {
        System.out.println(transaFile);
        configure(transaFile, minSup);
        go(transaFile);
    }

    
    
    private void go(String transaFile) throws Exception {
  

        createItemsetsOfSize1();   
        
        int itemsetNumber=1; 
        int nbFrequentSets=0;
        
        while (itemsets.size()>0)
        {

            calculateFrequentItemsets(transaFile);

            if(itemsets.size()!=0)
            {
                nbFrequentSets+=itemsets.size();
                createNewItemsetsFromPreviousOnes();
            }

            itemsetNumber++;
        } 

    }
    
    
    private void createItemsetsOfSize1() {
		
            itemsets = new ArrayList<int[]>();

            for(int i=0; i<numItems; i++)
            {
                    int[] cand = {i};
                    itemsets.add(cand);
            }
    }
    

   
    private void foundFrequentItemSet(int[] itemset, int support) {
    	if (usedAsLibrary) {
            this.setChanged();
            notifyObservers(itemset);
    	}
    	else {System.out.println(Arrays.toString(itemset) + "  ("+ ((support / (double) numTransactions))+" "+support+")");}
    }

  
    private void log(String message) {
    	
    	System.err.println(message);
    	
    }

    /** computes numItems, numTransactions, and sets minSup */
    private void configure(String transaFile, double minSup) throws Exception
    {        
       
    	numItems = 0;
    	numTransactions=0;
    	BufferedReader data_in = new BufferedReader(new FileReader(transaFile));
    	while (data_in.ready()) {    		
    		String line=data_in.readLine();
    		if (line.matches("\\s*")) continue; // be friendly with empty lines
    		numTransactions++;
    		StringTokenizer t = new StringTokenizer(line," ");
    		while (t.hasMoreTokens()) {
    			int x = Integer.parseInt(t.nextToken());
    			//log(x);
    			if (x+1>numItems) numItems=x+1;
    		}    		
    	}  
    	
        outputConfig();

    }

   /** outputs the current configuration
     */ 
	private void outputConfig() {
		//output config info to the user
		 log("Input configuration: "+numItems+" items, "+numTransactions+" transactions, ");
		 log("minsup = "+minSup+"%");
	}


	
			
    private void createNewItemsetsFromPreviousOnes()
    {

        int currentSizeOfItemsets = itemsets.get(0).length;
        	
    	HashMap<String, int[]> tempCandidates = new HashMap<String, int[]>(); 
    	

        for(int i=0; i<itemsets.size(); i++)
        {
            for(int j=i+1; j<itemsets.size(); j++)
            {
                int[] X = itemsets.get(i);
                int[] Y = itemsets.get(j);

                assert (X.length==Y.length);
                
                //make a string of the first n-2 tokens of the strings
                int [] newCand = new int[currentSizeOfItemsets+1];
                for(int s=0; s<newCand.length-1; s++) {
                	newCand[s] = X[s];
                }
                    
                int ndifferent = 0;
                // then we find the missing value
                for(int s1=0; s1<Y.length; s1++)
                {
                	boolean found = false;
                	// is Y[s1] in X?
                    for(int s2=0; s2<X.length; s2++) {
                    	if (X[s2]==Y[s1]) { 
                    		found = true;
                    		break;
                    	}
                	}
                	if (!found){ // Y[s1] is not in X
                		ndifferent++;
                		// we put the missing value at the end of newCand
                		newCand[newCand.length -1] = Y[s1];
                	}
            	
            	}
                
                // we have to find at least 1 different, otherwise it means that we have two times the same set in the existing candidates
                assert(ndifferent>0);
                
                
                if (ndifferent==1) {
                	Arrays.sort(newCand);
                	tempCandidates.put(Arrays.toString(newCand),newCand);
                }
            }
        }
        
        //set the new itemsets
        itemsets = new ArrayList<int[]>(tempCandidates.values());
    	log("Created "+itemsets.size()+" unique itemsets of size "+(currentSizeOfItemsets+1));

    }



    /** put "true" in trans[i] if the integer i is in line */
    private void line2booleanArray(String line, boolean[] trans) {
	    Arrays.fill(trans, false);
	    StringTokenizer stFile = new StringTokenizer(line, " "); //read a line from the file to the tokenizer
	    //put the contents of that line into the transaction array
	    while (stFile.hasMoreTokens())
	    {
	    	
	        int parsedVal = Integer.parseInt(stFile.nextToken());
			trans[parsedVal]=true; //if it is not a 0, assign the value to true
	    }
    }

    
    /** passes through the data to measure the frequency of sets in {@link itemsets},
     *  then filters thoses who are under the minimum support (minSup)
     */
    private void calculateFrequentItemsets(String transaFile) throws Exception
    {
    	
        log("Passing through the data to compute the frequency of " + itemsets.size()+ " itemsets of size "+itemsets.get(0).length);

        List<int[]> frequentCandidates = new ArrayList<int[]>(); //the frequent candidates for the current itemset

        boolean match; //whether the transaction has all the items in an itemset
        int count[] = new int[itemsets.size()]; //the number of successful matches, initialized by zeros


		// load the transaction file
		BufferedReader data_in = new BufferedReader(new InputStreamReader(new FileInputStream(transaFile)));

		boolean[] trans = new boolean[numItems];
		
		// for each transaction
		for (int i = 0; i < numTransactions; i++) {

			// boolean[] trans = extractEncoding1(data_in.readLine());
			String line = data_in.readLine();
			line2booleanArray(line, trans);

			// check each candidate
			for (int c = 0; c < itemsets.size(); c++) {
				match = true; // reset match to false
				// tokenize the candidate so that we know what items need to be
				// present for a match
				int[] cand = itemsets.get(c);
				//int[] cand = candidatesOptimized[c];
				// check each item in the itemset to see if it is present in the
				// transaction
				for (int xx : cand) {
					if (trans[xx] == false) {
						match = false;
						break;
					}
				}
				if (match) { // if at this point it is a match, increase the count
					count[c]++;
					//log(Arrays.toString(cand)+" is contained in trans "+i+" ("+line+")");
				}
			}

		}
		
		data_in.close();

		for (int i = 0; i < itemsets.size(); i++) {
			// if the count% is larger than the minSup%, add to the candidate to
			// the frequent candidates
			if ((count[i] / (double) (numTransactions)) >= minSup) {
				foundFrequentItemSet(itemsets.get(i),count[i]);
				frequentCandidates.add(itemsets.get(i));
			}
		}

        //new candidates are only the frequent candidates
        itemsets = frequentCandidates;
    }
}