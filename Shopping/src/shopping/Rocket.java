
package shopping;

public class Rocket implements Payment{
    public Rocket(){
        System.out.println("rocket");
    }

    @Override
    public void pay() {
        System.out.println("paying through rocket");
    }
}
