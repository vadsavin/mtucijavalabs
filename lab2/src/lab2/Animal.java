package lab2;

public abstract class Animal {
	public double Food;
	public boolean Sleep;
	
	public Animal(boolean sleep) {
		Sleep = sleep;
	}
	
	public void MakeNoise() {
		System.out.println(Sleep ? "Zzz.." : GetSound());
	}
	
	public abstract String GetSound();
}
