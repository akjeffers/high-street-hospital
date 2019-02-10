package hospital;

import java.util.HashMap;

import employees.Doctor;
import employees.Employee;
import employees.NormalJanitor;
import employees.Nurse;
import employees.Receptionist;
import employees.Surgeon;
import employees.VampireJanitor;
import patient.Patient;

public class Hospital {
	
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();
	private int cleanliness = 100;
	
	public Hospital() {
		
	}
	
	
	public HashMap<String, Employee> getEmployees() {
		return employees;
	}
	
	public HashMap<String, Patient> getPatients() {
		return patients;
	}
	
	public int getHospitalEmployeeSize() {
		return employees.size();
	}
	
	public int getHospitalPatientSize() {
		return patients.size();
	}
		
	public void getEmployeeNames() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getName());
		}
	}
	
	public void getPatientNames() {
		for (Patient patient : patients.values()) {
			System.out.println(patient.getName());
		}
	}

	public void addEmployee(Employee employee) {
		employees.put(employee.getName(), employee);	
	}
	
	public void addPatient(Patient patient) {
		patients.put(patient.getName(), patient);
	}
	
	public void listAllSalaries() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.calculatePay());
		}
	}
}

