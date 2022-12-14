package lab4;

public class Program {

	public static void main(String[] args) {
		var db = Database.GetDatabase();
		db.Register("admin", "12345");
		
		var catalog = new Catalog<Product>("???????");
		catalog.Products.add(new Product("??????", 10));
		catalog.Products.add(new Product("???", 15));
		catalog.Products.add(new Product("???", 22));
		
		catalog.ShowProducts();
		
		var user = db.Login("admin", "12345");
		user.GetProduct(catalog, catalog.Products.get(0));
		Shop.Serve(user);
	}
}
