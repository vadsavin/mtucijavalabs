package lab2;

public class Cat extends Animal{
	public Cat(boolean sleep) {
		super(sleep);
	}

	@Override
	public String GetSound() {
		return "Meeeow";
	}	
}
