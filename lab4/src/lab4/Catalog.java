package lab4;

import java.util.ArrayList;

public class Catalog <T extends Product> {
	public ArrayList<T> Products;
	public String Name;
	
	public Catalog(String name) {
		Name = name;
		Products = new ArrayList<T>();
	}
	
	public void ShowProducts() {
		for(Product p : Products) {
			System.out.println(p.GetProductDescription());
		}
	}
}
