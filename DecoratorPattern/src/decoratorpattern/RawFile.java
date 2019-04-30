
package decoratorpattern;

/**
 *
 * @author rez1
 */
public class RawFile implements IFile{

    @Override
    public void read() {
        System.out.println("Raw File");
    }

    @Override
    public void write() {
        System.out.println("raw file");
    }
 
}
