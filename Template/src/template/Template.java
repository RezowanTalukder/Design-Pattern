
package template;

import java.util.Scanner;

/**
 *
 * @author rez1
 */
public class Template {

    public static void main(String[] args) {
        int opt ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Select your operator:\n 1: Gp\n 2: Banglalink");
        opt =sc.nextInt() ;
        if(opt==1){
            Operator gp = new GrameenPhone() ;
            gp.getValue();
        }
        if(opt==2){
            Operator bl = new Banglalink();
            bl.getValue();
        }
    }
    
}
