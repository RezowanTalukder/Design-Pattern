package composite_main;


public class Circle implements Shape{

    @Override
    public void draw(String fillcolor) {

        System.out.println("drawing Circle with "+fillcolor+" color");
    }

}
