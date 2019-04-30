
package compositeassignment;


public class Rectangle implements IShape{
    IShape[] rectangleEdges = {new Line(-1,-1,1,-1),new Line(-1,1,1,1),new Line(-1,-1,-1,1),new Line(1,-1,1,1)};
	
	

	@Override
	public IShape[] explodeShape() {
		
		return rectangleEdges;
	
	}

	public void renderShapeToScreen() {


		for(IShape s : rectangleEdges){
		
	           // delegate to child objects
			s.renderShapeToScreen();
			
		}
		
	}
}
