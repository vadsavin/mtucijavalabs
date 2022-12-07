package lab2;

public class Student {
	public String FirstName;
	public String LastName;
	public String Group;
	
	public double AvarageMark;
	
	public Student(String firstName, double mark) {
		AvarageMark = mark;
		FirstName = firstName;
	}
	
	public int GetScholarship() {
		return AvarageMark == 5 ? 100 : 80;
	}
}
