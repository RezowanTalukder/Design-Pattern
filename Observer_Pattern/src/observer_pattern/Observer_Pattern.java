
package observer_pattern;

/**
 *
 * @author USER
 */
public class Observer_Pattern {

    public static void main(String[] args) {
         Subject subject = new Subject() ;
         
         Observer hexObserver = new HexObserver(subject) ;
         
         new BinaryObserver(subject) ;
         new OctalObserver(subject);
         
         subject.setState(15);
         
         subject.setState(20);
         
         subject.dettach(hexObserver);
         subject.setState(30);
         
    }
    
}
