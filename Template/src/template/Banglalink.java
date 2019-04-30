package template;

import java.util.Scanner;


public class Banglalink extends Operator{
    Scanner sc = new Scanner(System.in) ;
    int time,rate = 0 ;
    @Override
    void getCallCharge() {
        int time,charge ;
        System.out.println("Enter talk time:");
        time = sc.nextInt() ;
        charge=time*rate ;
        System.out.println("your charge as BL: "+charge);
    }

    @Override
    void getCallRate() {      
        System.out.println("1:day\n2:night");
        time = sc.nextInt() ;
        if(time==0)rate =5 ;
        else rate= 10;    

    }

}
