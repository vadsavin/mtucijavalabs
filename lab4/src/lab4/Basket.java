package lab4;

import java.util.ArrayList;

public class Basket {
	public ArrayList<Product> Products;
	
	public Basket() {
		Products = new ArrayList<Product>();
	}
	
	public String GetContents() {
		StringBuilder sb = new StringBuilder();
		for(Product p : Products) {
			sb.append(p.GetProductDescription()+'\n');
		}
		return sb.toString();
	}
}
