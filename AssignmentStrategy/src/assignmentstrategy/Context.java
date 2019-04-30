
package assignmentstrategy;

/**
 *
 * @author rez1
 */
public class Context {
   private Notification notif ;
   public Context(Notification notif){
       this.notif = notif ;
   }
   
   public void getMethod(){
       notif.notifyUser();
   }
   
}
