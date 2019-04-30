package mainclass ;

import java.util.Scanner;

public class MainClass  {
	public static void main(String[] args) {
		
		
		
		int a ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("1. For Kids \n 2. For Adult\n") ;
		a = sc.nextInt() ;

		if(a==1){
                        MakeOrder makeOrder = new MakeOrder() ;	
			Order orderKid  = makeOrder.kidsMeal() ;
			orderKid.showItems() ;
			System.out.println("Total Cost: "+orderKid.getCost() );	
		}

		if(a==2){
                        MakeOrder makeOrder = new MakeOrder() ;
			Order orderAdult  = makeOrder.adultsMeal() ;
			orderAdult.showItems() ;
			System.out.println("Total Cost: "+orderAdult.getCost() );	
		}
	}
}