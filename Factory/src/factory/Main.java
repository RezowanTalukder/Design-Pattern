
package factory;

import java.util.Scanner;

/**
 *
 * @author rez1
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("1. Oriental\n2. Occidental\n");
        int a  = sc.nextInt() ;
        
        Factory f = new Factory() ;
        f.factory(a);
    }
}
