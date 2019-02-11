package employees;

import java.util.Scanner;

import hospital.Hospital;
import patient.Patient;

public class Application {

	private static String userInput;
	private static String patientName;
	private static String individualCare;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();

		//see if we can combine constructor lines and adding lines below for patients and employees......
		
		Surgeon surgeon = new Surgeon("John", "123", "Surgeon");
		Nurse nurse = new Nurse("Bob", "222", "Nurse");
		Receptionist receptionist = new Receptionist("Jan", "333", "Receptionist");
		VampireJanitor vampireJanitor = new VampireJanitor("Joe", "444", "Vampire Janitor");
		NormalJanitor normalJanitor = new NormalJanitor("Nancy", "555", "Janitor");

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
		
		boolean repeatMainMenu = true;

		while (repeatMainMenu) {
			
			// print menu
			System.out.println("What would you lke to do?");
			System.out.println("Choose menu item by typing in number: ");
			System.out.println("1. See employee stats");
			System.out.println("2. See patient stats");
			System.out.println("3. Care for all patients");
			System.out.println("4. Care for individual patient");
			System.out.println("5. Have a janitor clean the hospital");
			System.out.println("6. Quit");

			// handle user commands
			String mainMenuChoice = input.nextLine();

			switch (mainMenuChoice) {

			case "1":

				System.out.println("You've chosen item #1");
				System.out.println("Which stats would you like to see?");
				System.out.println("1. Employee names, ID numbers, and jobs");
				System.out.println("2. Employee salaries");

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

				boolean repeatCareAllMenu = true;
				
				while (repeatCareAllMenu) {
				
					System.out.println("You've chosen item #3");
					System.out.println(" 1. - Take care of all patients");
					System.out.println(" 2. - Draw blood from all patients");
					System.out.println(" 3. - Return to main menu");
					userInput = input.nextLine();
					
					switch (userInput) {
					
					case "1":
						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
							nurse.careForPatient(patient);
							System.out.println(patient.toString());
						}
						break;
						
					case "2":
						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
							nurse.drawBlood(patient);
							System.out.println(patient.toString());
						}
						break;
						
					case "3":
						repeatCareAllMenu = false;
						break;
					}

				}
				break;
				
			case "4":
				
				boolean repeatIndividualCare = true;
				
				while (repeatIndividualCare) {
					
					System.out.println("You've chosen item #4");
					System.out.println(" 1 - Take care of individual patient");
					System.out.println(" 2. - Draw blood from individual patient");
					System.out.println(" 3. - Return to main menu");
					individualCare = input.nextLine();
				
					switch (individualCare) {
					
					case "1":

						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());	
						}
						System.out.println("Type in patient name to proceed");
						patientName = input.nextLine();
						Patient patientChoice = hospital.findPatient(patientName);
						System.out.println(patientChoice.getName() + " is so happy to be helped!");
				
						nurse.careForPatient(patientChoice);
						System.out.println(patientChoice.toString());

					break;
					
					case "2":
						
						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());	
						}
						System.out.println("Type in patient name to proceed");
						patientName = input.nextLine();
						Patient patientBloodChoice = hospital.findPatient(patientName);
						System.out.println(patientBloodChoice.getName() + " is so happy to be helped!");
				
						nurse.drawBlood(patientBloodChoice);
						System.out.println(patientBloodChoice.toString());
					break;
						
					case "3":
						repeatIndividualCare = false;
					break;
					
					}
				}
				break;
				
			case "5":

				boolean repeatJanitorMenu = true;
				while (repeatJanitorMenu) {
					
					System.out.println("You've chosen item #5");
					System.out.println("Which janitor would you like to have sweep?");
					System.out.println("1. - Normal Janitor");
					System.out.println("2. - Vampire Janitor");
					System.out.println("3. - Get Cleanliness level of hospital");
					System.out.println("4. - Return to main menu");
					String janitorChoice = input.nextLine();
			
					switch (janitorChoice) {
					
					case "1":
						normalJanitor.sweepHospital(hospital);	
					break;
					
					case "2":
						vampireJanitor.sweepHospital(hospital);
						System.out.println(hospital.getPatients().toString());
						vampireJanitor.drawBlood(firstPatient);
						vampireJanitor.drawBlood(secondPatient);
						vampireJanitor.drawBlood(thirdPatient);
						vampireJanitor.drawBlood(fourthPatient);
						vampireJanitor.drawBlood(fifthPatient);
						System.out.println(hospital.getPatients().toString());
						System.out.println("Oh no! The vampire janitor took blood from"
								+ " all patients while sweeping!");
					break;
					
					case "3":
						System.out.println(hospital.getCleanliness());
					break;	
						
					case "4":
						repeatJanitorMenu = false;
					break;
					
					}	
					
				}
					break;
			case "6":

				repeatMainMenu = false;
				System.out.println("Bye-bye!");

				break;

			default:

				System.out.println("Invalid choice.");

			}

		}
		
	}

}
