
package composite_main;

/**
 *
 * @author USER
 */
public class Composite_Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle() ;
        triangle.draw("green");
        
        Shape circle =  new Circle() ;
        circle.draw("red") ;
                
        Shape line = new Line() ;
        line.draw("yellow");
        
        Drawing dr = new Drawing() ;
        dr.add(line);
        dr.add(circle);
        dr.add(triangle);
        
        dr.draw("violet");

    }
    
}
