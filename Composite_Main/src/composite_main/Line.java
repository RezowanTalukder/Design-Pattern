package composite_main;


public class Line implements Shape{

    @Override
    public void draw(String fillcolor) {
        
         System.out.println("drawing Line with "+ fillcolor +" color");
      
    }

}
