package makeshapes;

import java.util.ArrayList; 
import java.util.List; 
import java.awt.Graphics;


public class Flag implements IShape{
	
	private List<IShape> com_list = new ArrayList<IShape>();
	private int x1,y1, x2,y2, x3,y3, x4,y4;
	public Flag() {
		
	}
	public void setX1(int x) { x1 = x; }
	public int getX1() { return x1; }
	public void setY1(int y) { y1 = y; }
	public int getY1() { return y1; }
	
	public void setX2(int x) { x2 = x; }
	public int getX2() { return x2; }
	public void setY2(int y) { y2 = y; }
	public int getY2() { return y2; }
	
	public void setX3(int x) { x3 = x; }
	public int getX3() { return x3; }
	public void setY3(int y) { y3 = y; }
	public int getY3() { return y3; }
	
	public void setX4(int x) { x4 = x; }
	public int getX4() { return x4; }
	public void setY4(int y) { y4 = y; }
	public int getY4() { return y4; }
	
	public void addComponents() {
		
		com_list.add(new Line(getX1(), getY1(), getX2(), getY2()));
		com_list.add(new Line(getX2(), getY2(), getX3(), getY3()));
		com_list.add(new Line(getX3(), getY3(), getX4(), getY4()));
		com_list.add(new Line(getX4(), getY4(), getX1(), getY1()));
		
		int halfX = (getX2() - getX1())/2;
		int halfY = (getY4() - getY1())/2;
		
		int rad = Math.min(halfX, halfY);
		
		int x = getX1() + halfX - halfX/3;
		int y = getY1() + halfY - halfY/3;
		
		com_list.add( new Circle(x , y , rad * 3/4) );
	}
	
	public void draw(Graphics g) {
		
		this.addComponents();
		
		for(IShape component: com_list) {
			component.draw(g);
		}
	}
}
