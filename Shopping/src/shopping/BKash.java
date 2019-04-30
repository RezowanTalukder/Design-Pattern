
package shopping;

/**
 *
 * @author rez1
 */
public class BKash implements Payment{
    public BKash(){
        System.out.println("bkash");
    }

    @Override
    public void pay() {
        System.out.println("paying through bkash");
    }
}
