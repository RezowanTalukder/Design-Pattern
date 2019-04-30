package mainclass ;

import java.util.ArrayList;
import java.util.List;

public class Order  {
	private List<Restaurant> items= new ArrayList<Restaurant>() ;

	public void addItem(Restaurant item){
		items.add(item) ;
	}

	public float getCost(){
		float cost = (float) 0.0 ;

		for(Restaurant item: items){
			cost+=item.price() ;
		}

		return cost ;
	}

	public void showItems(){
            System.out.println("ITEMS IN THIS PACKAGE") ;
            
		for (Restaurant item: items) {
			System.out.println(item.name()) ;

		}
	}
}