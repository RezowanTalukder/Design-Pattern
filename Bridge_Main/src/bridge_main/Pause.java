
package bridge_main;

/**
 *
 * @author rez1
 */
public class Pause extends Remote{

    public Pause(ED ed) {
        super(ed);
    }

    @Override
    public void five() {
        System.out.println("paused");
    }
    
}
