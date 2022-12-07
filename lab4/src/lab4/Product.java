package lab4;

public class Product {
	public String Name;
	public int Id;
	public double Weight;
	public double Price;
	
	public Product(String name, double price) {
		Name = name;
		Price = price;
		Id = name.hashCode()+(int)Price;
	}
	
	public String GetProductDescription() {
		return Id +": " + Name + " " + Price +"ð. " + Weight + "g.";
	}
}
