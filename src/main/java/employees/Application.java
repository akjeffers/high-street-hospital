package employees;

import java.util.Scanner;

import hospital.Hospital;
import patient.Patient;

public class Application {

	private static String userInput;
	private static String patientName;

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		Surgeon surgeon = new Surgeon("John", "123", "surgeon");
		Nurse nurse = new Nurse("Bob", "222", "nurse");
		Receptionist receptionist = new Receptionist("Jan", "333", "receptionist");
		VampireJanitor vampireJanitor = new VampireJanitor("Joe", "444", "vampire janitor");
		NormalJanitor normalJanitor = new NormalJanitor("Nancy", "555", "janitor");

		hospital.addEmployee((Employee) surgeon);
		hospital.addEmployee((Employee) nurse);
		hospital.addEmployee((Employee) receptionist);
		hospital.addEmployee((Employee) vampireJanitor);
		hospital.addEmployee((Employee) normalJanitor);

		Patient firstPatient = new Patient("Barb Bowen", "11", 20, 10);
		Patient secondPatient = new Patient("Donnie Klang", "22", 20, 10);
		Patient thirdPatient = new Patient("Michael Scott", "33", 20, 10);
		Patient fourthPatient = new Patient("Joe Zsabo", "44", 20, 10);
		Patient fifthPatient = new Patient("Merv Chapman", "55", 20, 10);

		hospital.addPatient(firstPatient);
		hospital.addPatient(secondPatient);
		hospital.addPatient(thirdPatient);
		hospital.addPatient(fourthPatient);
		hospital.addPatient(fifthPatient);

		System.out.println("Welcome to High St Hospital");
		System.out.println("---------------------------");
		Scanner input = new Scanner(System.in);

		// print menu
		System.out.println("What would you lke to do?");
		System.out.println("Choose menu item by typing in number: ");
		System.out.println("1. See employee stats");
		System.out.println("2. See patient stats");
		System.out.println("3. Care for all patients");
		System.out.println("4. Care for individual patient");
		System.out.println("5. Have a janitor clean the hospital");
		System.out.println("0. Quit");

		// handle user commands

		boolean quit = false;

		while (!quit) {

			String mainMenuChoice = input.nextLine();

			switch (mainMenuChoice) {

			case "1":

				System.out.println("You've chosen item #1");
				System.out.println("Which stats would you like to see?");
				System.out.println("1. Employee names, ID numbers, and jobs");
				System.out.println("2. Employee salaries");
				System.out.println("3. Take care of patients -- Draw Blood");

				String employeeStatChoice = input.nextLine();

				if (employeeStatChoice.equals("1")) {
					for (Employee employee : hospital.getEmployees().values()) {
						System.out.println(employee.toString());
					}
				} else if (employeeStatChoice.equals("2")) {
					hospital.listAllSalaries();
				}
				break;

			case "2":

				System.out.println("You've chosen item #2");
				System.out.println("Here are the patient stats:");
				for (Patient patient : hospital.getPatients().values()) {
					System.out.println(patient.toString());
				}
				break;

			case "3":

				System.out.println("You've chosen item #3");
				System.out.println(" 1 - Take care of individual patient");

				System.out.println(" 2 - Take care of all patients");
				System.out.println(" 3. - Draw Blood from individual patient");
				System.out.println(" 4. - Draw Blood from all patients");
				userInput = input.nextLine();
				switch (userInput) {
				case "1":
					for (Patient patient : hospital.getPatients().values()) {
						System.out.println(patient.toString());
						
					}
					System.out.println("Type in patient name to proceed");
					patientName = input.nextLine();
					
				}

				break;

			case "4":

				System.out.println("You've chosen item #4");

				// do something...

				break;

			case "5":

				System.out.println("You've chosen item #5");

				// do something...

				break;

			case "0":

				quit = true;

				break;

			default:

				System.out.println("Invalid choice.");

			}

		}
		while (!quit)
			;

		System.out.println("Bye-bye!");

	}

//		NormalJanitor janitor2 = new NormalJanitor("TT", "124", "Janitor");
//		Nurse nurse1 = new Nurse("T", "123", "Nurse");
//		System.out.println(nurse1.getPay());

}
