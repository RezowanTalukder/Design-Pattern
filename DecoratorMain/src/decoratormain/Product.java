package decoratormain;


public class Product implements IProduct{
    
        public double attributes[] = new double[3];
	public String name[] = new String[1];
	

	public Product(String na, double buy, double expiry, double price) {
		name[0] = na;
		attributes[0] = buy;
		attributes[1] = expiry;
		attributes[2] = price;
	}


	public void getName() {
		System.out.println("Name: " + name[0]);
	}
	

	public void getBuy() {
		System.out.println("Buy: " + attributes[0]);
	}


	public void getExpiry() {
		System.out.println("Expiry: " + attributes[1]);
	}


	public void getPrice() {
		System.out.println("Price: " + attributes[1]);
	}
}
