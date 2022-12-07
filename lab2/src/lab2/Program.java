package lab2;

public class Program {

	public static void main(String[] args) {
		Student[] students = new Student[] {
			new Student("Makar", 5),
			new Student("Dima", 3),
			new Aspirant("Sveta", 5),
			new Aspirant("Masha", 3)
		};
		
		for(Student s : students) {
			System.out.println(s.FirstName + ": " + s.GetScholarship());
		}
		System.out.println();
		
		var veterinar = new Veterinar();
		Animal[] animals = new Animal[] {
				new Cat(true),
				new Cat(false),
				new Dog(false)
			};
			
		for(Animal a : animals) {
			veterinar.TreatAnimal(a);
		}
		
		Phone[] phones = new Phone[] {
				new Phone("89005556688", "Samsung A52", 300),
				new Phone("89005556689", "iPhone 13", 352),
				new Phone("89005556690", "Xiaomi Su", 294)
			};
		
		for(Phone p : phones) {
			System.out.println(p.Number + ", " + p.Model + ", " + p.Weight);
		}
		System.out.println();
	}
}
