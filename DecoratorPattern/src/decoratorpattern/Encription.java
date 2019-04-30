
package decoratorpattern;

/**
 *
 * @author rez1
 */
public class Encription extends Decorator{

    IFile file ;
    public Encription(IFile file){
        this.file = file ;
    }

    
    public void read() {
        System.out.println("Encripted");
    }

    
    public IFile write(IFile temp) {
        return temp ;
    }
    
    
}
