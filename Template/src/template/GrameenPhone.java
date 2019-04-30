package template;

import java.util.Scanner;


public class GrameenPhone extends Operator{
    Scanner sc = new Scanner(System.in) ;
    int time,charge,rate ;
    
    @Override
    void getCallCharge() {
        System.out.println("Enter talk time:");
        time = sc.nextInt() ;
        charge=time*rate ;
        System.out.println("your charge as GP: "+charge);
    }

    @Override
    void getCallRate() {   
        System.out.println("1:day\n2:night");
        time = sc.nextInt() ;
        if(time==0)rate = 2 ;
        else rate = 1;    
 
    }

}
