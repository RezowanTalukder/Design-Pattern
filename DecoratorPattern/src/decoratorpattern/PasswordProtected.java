
package decoratorpattern;

public class PasswordProtected extends Decorator{

    IFile file ;
    public PasswordProtected(IFile file){
        this.file = file ;
    }
    
    @Override
    public void read() {
        System.out.println("Password Protected");
    }

    @Override
    public IFile write(IFile temp) {
        return temp ;
    }
    
}
