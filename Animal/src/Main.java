
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog() ;
        dog.flyability = new CantFly() ;
        dog.flyability.flyStyle();
    }
}
