
package shopping;

/**
 *
 * @author rez1
 */
public class Main {
    public static void main(String[] args) {
        Product pro = new Product() ;
        pro.p = (Payment) new BKash() ;
        
        pro.p.pay();
        
    }
}
