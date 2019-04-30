package decoratormain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Dec_Products implements IProduct{
	
	private List <Product> productList = new ArrayList <Product> ();
	private List <Product> sortedProductList = new ArrayList <Product> ();
	
	private int previousSortIndex = -1;
	IProduct product;
	
	public Dec_Products(List<Product> sentProductList) {
		productList = sentProductList;
	}


	public void getName() {
		product.getName();
	}


	public void getBuy() {
		product.getBuy();
	}


	public void getExpiry() {
		product.getExpiry();
	}


	public void getPrice() {
		product.getPrice();
	}
	
	public void provideInfo() {
		
		for(IProduct human: productList) {
			product = human;
			product.getName();
			product.getBuy();
			product.getExpiry();
			product.getPrice();
		}
	}
	
	public List<Product> sortProduct(int attrIndex){
		
		Collections.sort(productList, new productComparator(attrIndex, previousSortIndex));
		previousSortIndex = attrIndex;
		
		
		return  productList;
	}

}
