package compositeassignment;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author rez1
 */
public class Line implements IShape {
    public Line(int point1X, int point1Y, int point2X, int point2Y) {
	
	}

    Line() {

    }
	
	@Override
	public IShape[] explodeShape() {
	
		IShape[] shapeParts = {this};
	
		return shapeParts;
	
	}


	public void renderShapeToScreen() {

           	paintComponent(null);

	}
        
        
        public void paintComponent(Graphics g) {
 
    
            g.setColor(Color.red);
            g.drawLine(20, 20, 20, 120);

            //horizontal line
            g.setColor(Color.green);
            g.drawLine(20, 20, 120, 20);

            //diagonal line 
            g.setColor(Color.blue);
            g.drawLine(20, 20, 120, 120);
 
        }
}
