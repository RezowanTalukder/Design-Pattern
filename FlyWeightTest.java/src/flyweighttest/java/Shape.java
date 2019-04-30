package flyweighttest.java;


import java.awt.*;
public class Shape {
   private Color color = Color.black;
   private int x, y, x2, y2;
   
   public Shape(Color color) {
	   
	   this.color = color;
	   
   }
   
   public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
	      g.setColor(color);
	      g.fillOval(upperX, upperY, lowerX, lowerY);
   }
   
}