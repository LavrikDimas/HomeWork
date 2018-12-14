package homeworks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		Product produt1 = new Product("Coca-Cola", 15);
		Product produt2 = new Product("Banana", 35);
		Product produt3 = new Product("Rabbit", 200);
		Product produt4 = new Product("Rabbit", 200);
		
		Basket basket = new Basket();
		basket.addProduct(produt1);
		basket.addProduct(produt2);
		basket.addProduct(produt3);
		basket.addProduct(produt4);
		//basket.addProduct(produt4);
		
		basket.showBasket();
		basket.totalPrise();
		basket.removeProdoct("Rabbit");
		basket.removeProdoct("Coca-Cola");
		basket.removeProdoct("Banana");
		System.out.println();
		basket.showBasket();
		
		
	}

}
