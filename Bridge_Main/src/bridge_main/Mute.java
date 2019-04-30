
package bridge_main;

/**
 *
 * @author rez1
 */
public class Mute extends Remote{

    public Mute(ED ed) {
        super(ed);
    }
    
    @Override
    public void five() {
        System.out.println("muted");
    }
    
}
