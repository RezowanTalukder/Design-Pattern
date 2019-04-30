
package composite;

/**
 *
 * @author rez1
 */
public class Composite {

    public static void main(String[] args) {
       CompositeShape comp = new CompositeShape() ;
       
       /*
       IShape line = new Line() ;
       IShape circle = new Circle() ;
       
       comp.addShape(line) ;
       comp.addShape(circle) ;
       */
       
       System.out.println("TRIANGLE");
       comp.triangle();
       
       System.out.println("\n\nRECTANGLE");
       comp.recangle();
    }
    
}
