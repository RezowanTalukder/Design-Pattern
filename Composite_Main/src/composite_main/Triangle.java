package composite_main;


public class Triangle implements Shape{

    @Override
    public void draw(String fillcolor) {

        System.out.println("drawing Triangle with "+ fillcolor +" color");
        
    }

}
