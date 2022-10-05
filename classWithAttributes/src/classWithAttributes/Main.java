package classWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setDescription("Monster");
		product.setId(1);
		product.setPrice(40000);
		product.setStockAmount(2);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
	}

}
