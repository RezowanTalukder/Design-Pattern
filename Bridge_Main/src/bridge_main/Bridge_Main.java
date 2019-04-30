
package bridge_main;

/**
 *
 * @author rez1
 */
public class Bridge_Main {

    public static void main(String[] args) {
        ED ed = new TV() ;
        Remote remote = new Mute(ed);
        remote.five() ;
        
    }
    
}
