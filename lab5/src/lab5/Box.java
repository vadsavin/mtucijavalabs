package lab5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	public ArrayList<T> Fruits;
	
	public double GetWeight() {
		double sum = 0;
		for(Fruit f : Fruits) {
			sum += f.Weight;
		}
		return sum;
	}
	
	public boolean Compare(Box<Fruit> box) {
		return this.GetWeight() == box.GetWeight();
	}
	
	public void MoveFruits(Box<Fruit> box) {
		box.Fruits.addAll(Fruits);
		Fruits = null;
	}
}
