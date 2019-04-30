package decoratormain;

import java.util.Comparator;

public class productComparator implements Comparator<Product>{
	
	private int index;
	private int previousSortIndex;
	
	public productComparator(int index, int prevIndex) {
		this.index = index;
		previousSortIndex = prevIndex;		
	}

	@Override
	public int compare(Product p1, Product p2) {

		
		if(previousSortIndex == -1) {			
		if (p1.attributes[index] < p2.attributes[index]) return -1; 
	        if (p1.attributes[index] > p2.attributes[index]) return 1; 
	        else return 0;
	       
		}
		else {			
			if(p1.attributes[previousSortIndex] == p2.attributes[previousSortIndex]) {
				
			if (p1.attributes[index] < p2.attributes[index]) return -1; 
		        if (p1.attributes[index] > p2.attributes[index]) return 1; 
		        else return 0;
		      
			}
			return 0;
		}
	}

}
