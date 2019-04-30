package flyweighttest.java;

import java.util.HashMap;
import java.awt.Color;

public class FactoryClass {
	
	
	private static final HashMap<Color, Shape> rectsByColor = new HashMap<Color, Shape>();
   
	public static Shape getOval(Color color) {
		Shape rect = (Shape)rectsByColor.get(color);
	
		if(rect == null) {
			rect = new Shape(color);
                        
		
			rectsByColor.put(color, rect);
         
		}
		return rect;
	}
}