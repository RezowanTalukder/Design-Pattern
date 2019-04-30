package makeshapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements IShape{
	
	int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	
	public void draw(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(x, y, radius, radius);
	}
}
