package mainclass ;


public class MakeOrder{

	public Order kidsMeal(){
		Order order = new Order() ;
                
		order.addItem(new Burger()) ;
		order.addItem(new Pepsi()) ;
		order.addItem(new Car()) ;

		return order ;
	}

	public Order adultsMeal(){
		Order order = new Order() ;
                
		order.addItem(new Pizza()) ;
		order.addItem(new Fanta()) ;
		order.addItem(new Ring()) ;

		return order ;
	}

}