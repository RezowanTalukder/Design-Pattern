
package main;

import java.util.ArrayList;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;



public class MainCommand extends Application {
	
	Pane mainPane;
	Color color=Color.GREEN;
	BorderPane root;
	ArrayList<CircleDrawer> list=new ArrayList<>();
	FactoryClass factory=new FactoryClass();
	
	@Override
	public void start(Stage primaryStage) {
		try {

			startUP();
			Scene scene = new Scene(root,1200,600,Color.GRAY);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Command Pattern");
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
	            @Override
	            public void handle(KeyEvent event) {
	            	
	            	
	            }
	        });

			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void startUP() {
		
		
		 TilePane right = new TilePane();
		 right.setPadding(new Insets(10, 10, 10, 10));
		 right.setPrefColumns(2);
		 VBox hbox2 = new VBox(18); 
		 hbox2.setAlignment(Pos.CENTER);
		 hbox2.setMinSize(200,400);
		 Button drawcircle = new Button("Draw Shape");
		 drawcircle.setMaxSize(120,Double.MAX_VALUE);
		 
		 drawcircle.setOnAction(new EventHandler<ActionEvent>() {
			    @Override 
			    public void handle(ActionEvent e) {
		
			    	CircleDrawer circle=new CircleDrawer(mainPane,color);
			    	list.add(circle);
			    	factory.addCommand(new Draw(circle));
			    	
			    	
			    }
		});
 
	
	   
		
		 hbox2.getChildren().addAll(drawcircle);
		 right.getChildren().add(hbox2);
                 
                 
		 
		 Pane left = new Pane();
		 VBox hbox3 = new VBox(18); // spacing = 8
		 hbox3.setMinSize(170,400);
		 hbox3.setAlignment(Pos.CENTER);
		 Button undo = new Button(" Undo ");
		 undo.setMaxSize(120,Double.MAX_VALUE);
		 undo.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
		
			    	
			    	factory.undo();
			    	
			    	
			    }
		});
		 
		 hbox3.setMaxSize(120,Double.MAX_VALUE);
		 Button redo = new Button(" Redo ");
		 redo.setMaxSize(120,Double.MAX_VALUE);
                 
		 redo.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
		
			    	
			    	factory.redo();
			    	
			    	
			    }
		});
		 
		 left.setMinSize(200,400);
		 hbox3.getChildren().addAll(undo,redo);
		 left.getChildren().add(hbox3);
		
		
		root = new BorderPane();
		
		
		mainPane=new Pane();
		mainPane.setMinSize(600, 700);
	
		root.setCenter(mainPane);

		root.setLeft(left);
		root.setRight(right);
		
	}
	
	
}
