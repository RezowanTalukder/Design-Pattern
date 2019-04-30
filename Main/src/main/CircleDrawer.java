package main;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleDrawer {
	
	public int max=350,min=250;
        public int cX,cY ;
	public int radius;
	public Color color;
	public Pane mainPane;
	Circle circle=new Circle();
	public CircleDrawer(Pane mainPane,Color color) {
		
		this.color=color;
		this.mainPane=mainPane;
	}
	
	public void draw() {
		
		cX = (int) ((Math.random() * ((max - min) + 1)) + min) ;
                cY = (int) ((Math.random() * ((max - min) + 1)) + min) ;

		circle.setCenterX(cX);
		circle.setCenterY(cY);
		circle.setFill(color);
		circle.setRadius(130);
		mainPane.getChildren().add(circle);
	}
	
	public void erase() {
		
		mainPane.getChildren().remove(circle);
	}

    void fillColor(Color preColor) {

    }
	

}
