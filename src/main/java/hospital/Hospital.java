package hospital;

import java.util.HashMap;

import employees.Doctor;
import employees.Employee;
import employees.NormalJanitor;
import employees.Nurse;
import employees.Receptionist;
import employees.Surgeon;
import employees.VampireJanitor;

public class Hospital {
	
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private int cleanliness;
	
//	Employee surgeon = new Surgeon("John", "123", "surgeon");
//	Employee nurse = new Nurse("Bob", "222", "nurse");
//	Employee receptionist = new Receptionist("Jan", "333", "receptionist");
//	Employee vampireJanitor = new VampireJanitor("Joe", "444", "vampire janitor");
//	Employee normalJanitor = new NormalJanitor("Nancy", "555", "janitor");
//	
	
	public HashMap<String, Employee> getEmployees() {
		return employees;
	}
	
	public int getHospitalSize() {
		return employees.size();
	}
		
	public void getEmployeeNames() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getName());
		}
	}

	public void addEmployee(Employee employee) {
		employees.put(employee.getName(), employee);	
	}
	


}
