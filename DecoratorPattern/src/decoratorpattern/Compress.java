
package decoratorpattern;

/**
 *
 * @author rez1
 */
public class Compress extends Decorator{
    IFile file ;
    public Compress(IFile file){
        super(file) ;
        //this.file = file ;
    }

    public void read() {
        System.out.println("Compress done");
    }

    public void write() {
        return temp ;
    }
    
}
