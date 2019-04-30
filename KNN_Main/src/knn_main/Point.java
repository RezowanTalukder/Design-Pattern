package knn_main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Point {
    
    private int a,b,c,d ;
    
    public Point(int a,int b,int c,int d){
        this.a =a ;
        this.b = b ;
        this.c =c ;
        this.d = d ;
        
    }

    
    public void readfromFile() throws IOException{
        File file =new File("data.txt") ;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line,line2[] ;
            int j = 0;
            while ((line = br.readLine()) != null) {
                line2 = line.split(",") ;
                points[j] = new Point(Integer.parseInt(2[0]), j, j, j);
                
                /*
                for(int i=0 ;i<line2.length ;i++){
                    
                    System.out.print(line2[i]+ " ");
                }
                
                System.out.print("\n");
*/
            }
        }
    }
    
}
