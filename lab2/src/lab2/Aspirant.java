package lab2;

public class Aspirant extends Student{
	public String Work;
	
	public Aspirant(String firstName, double mark) {
		super(firstName, mark);
	}
	
	@Override
	public int GetScholarship() {
		return AvarageMark == 5 ? 200 : 180;
	}
}
