package mainclass ;

public class Pizza extends MainDish{
	@Override
	public float price()
	{
		return 300.0f; 
	}

	@Override
	public String name()
	{
		return "PIZZA" ;
	}

}