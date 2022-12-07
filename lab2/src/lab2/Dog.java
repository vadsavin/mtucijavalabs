package lab2;

public class Dog extends Animal{
	public Dog(boolean sleep) {
		super(sleep);
	}

	@Override
	public String GetSound() {
		return "Bark-Bark!";
	}	
}
