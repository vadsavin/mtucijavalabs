package lab2;

public class Phone {
	public String Number;
	public String Model;
	public int Weight;
	
	public Phone(String number, String model, int weight) {
		Number = number;
		Model = model;
		Weight = weight;
	}
	
	public Phone(String number, String model) {
		this(number, model, 0);
	}	
	
	public void RecieveCall(String name) {
		System.out.println("name"+" is calling");
	}
	
	public void RecieveCall(String name, String number) {
		System.out.println(number + ": " + name+" is calling");
	}
	
	public String GetNumber() {
		return Number;
	}
	
	public void SendMessages(String ... numbers) {
		for(String n : numbers){
			System.out.println(n);
		}
	}
}
