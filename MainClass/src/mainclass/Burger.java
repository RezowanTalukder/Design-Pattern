package mainclass ;

public class Burger extends MainDish{
	@Override
	public float price()
	{
		return 200.0f; 
	}

	@Override
	public String name()
	{
		return "BURGER" ;
	}

}