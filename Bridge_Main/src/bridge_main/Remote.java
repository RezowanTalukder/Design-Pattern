
package bridge_main;

/**
 *
 * @author rez1
 */
public abstract class Remote {
    ED ed ;
    public Remote(ED ed) {
        this.ed = ed ;
    }
    
    
    
    public void one(){
        ed.one();
    }
    
    public void two(){
        ed.two();
    }
    
    public void three(){
        ed.three();
    }
    
    public void four(){
        ed.four();
    }
    
    public abstract void five() ;
    
}
