
package assignmentstrategy;


public class AssignmentStrategy {

    public static void main(String[] args) {
        Context email = new Context((Notification) new Email()) ;
        email.getMethod();
        
        Context sms = new Context((Notification) new SMS()) ;
        sms.getMethod();
        
    }
    
}
