
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rez1
 */
public class CompositeShape implements IShape{
    List<IShape> shape = new ArrayList<IShape>() ;
    
    public void addShape(IShape sh){
        shape.add(sh) ;
    }

    @Override
    public String draw() {
        for(IShape shap:shape){
            System.out.println(shap.draw());
        }
        return null;
    }
    
    public void triangle()
    {
        for(int i=0 ;i<3 ;i++){
            Line line = new Line() ;
            addShape(line);
        }
        
        draw() ;
        shape.clear();
    }
    
    public void recangle()
    {
        for(int i=0 ;i<4 ;i++){
            Line line = new Line() ;
            addShape(line);
        }
        
        draw() ;
        shape.clear();
        
    }
    
    
}
