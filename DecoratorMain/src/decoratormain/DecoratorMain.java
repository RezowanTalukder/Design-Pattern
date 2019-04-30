
package decoratormain;

import java.util.ArrayList;
import java.util.List;


public class DecoratorMain {

    public static void main(String[] args) {
        
        List <Product> list = new ArrayList <Product> (); 
	list.add(new Product("mouse", 3, 12, 270));
        list.add(new Product("ac", 2, 32, 3270));
        list.add(new Product("pc", 6, 12, 70));
        list.add(new Product("keyboard", 3,23, 2700));
       
        
        Dec_Products dec = new Dec_Products(list);
        list = dec.sortProduct(0);
     

        
        
        for (Product p: list) { 
            System.out.println("\nName: " + p.name[0]
            				+" | Buy date: " + p.attributes[0] 
            				+ " | Expiry date: " + p.attributes[1]
            				+ " | price: " + p.attributes[2]);
        }
        
        
        System.out.println("\n\n");
        
        list = dec.sortProduct(1);
        
        for (Product p: list) { 
            System.out.println("\nName: " + p.name[0]
            				+" | Buy date: " + p.attributes[0] 
            				+ " | Expiry date: " + p.attributes[1]
            				+ " | price: " + p.attributes[2]);
        }
        System.out.println("\n\n");
        
        list = dec.sortProduct(2);
        for (Product p: list) { 
            System.out.println("\nName: " + p.name[0]
            				+" | Buy date: " + p.attributes[0] 
            				+ " | Expiry date: " + p.attributes[1]
            				+ " | price: " + p.attributes[2]);
        }
        System.out.println("\n\n");
      
        
        
    }
    
}
