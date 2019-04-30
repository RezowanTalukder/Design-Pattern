
package decoratorpattern;

/**
 *
 * @author rez1
 */
public abstract class Decorator implements IFile{
    IFile file;
    public Decorator(IFile fl){
        file = fl;
    }
    public  void read(){
        file.read();
    }
    public void write(){
        file.write();
    }
}
