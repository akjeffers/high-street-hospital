package employees;

public class Application {

	public static void main(String[] args) {

		System.out.println("Welcome to High St Hospital");
		
		
		NormalJanitor janitor2 = new NormalJanitor("TT", "124", "Janitor");
		Nurse nurse1 = new Nurse("T", "123", "Nurse");
		System.out.println(nurse1.getPay());
		
	}

}
