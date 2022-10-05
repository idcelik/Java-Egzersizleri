package classWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setDescription("Monster");
		product.setId(1);
		product.setPrice(40000);
		product.setStockAmount(2);
		
		Product product2 = new Product(2, "Masaüstü", "Dell", 34000, 3, "blue");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		
		System.out.println(product2.getDescription());
	}

}
