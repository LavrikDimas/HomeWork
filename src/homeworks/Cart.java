package homeworks;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) throws Exception {
		if (product == null) {
			throw new Exception("You have to specify the product!");
		}
		
		if (products.contains(product)) {
			throw new Exception("The product is already in basket!");
		}
		products.add(product);
	}
	
	public void showBasket() {
		if (products.size() == 0)
		{
			System.out.println("Basket is empty!");
			return;
		}
		
		for(int i = 0; i < products.size(); i++) {
			System.out.println((i + 1) + ". " + products.get(i).getName() + ". " + products.get(i).getPrice());
		}
	}
	
	public void removeProdoct(String productName) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName() == productName) {
				products.remove(i);
				i--;
			}
		}
	}
	
	public void totalPrise() {
		int total = 0;
		for (int i = 0; i < products.size();i++) {
			total += products.get(i).getPrice();
		}
		
		System.out.println("Total price: " + total);
	}
}
