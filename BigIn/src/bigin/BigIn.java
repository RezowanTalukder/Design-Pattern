
package bigin;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author rez1
 */
public class BigIn {
    
    static BigInteger fact(int n){
        BigInteger ans =new BigInteger("1") ;
        
        for(int i=2 ;i<=n ;i++){
            ans = ans.multiply(BigInteger.valueOf(i)) ;
        }
        
        
        return ans ;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        
        System.out.println(fact(a));
    }
    
}
