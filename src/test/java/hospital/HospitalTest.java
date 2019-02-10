package hospital;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import employees.Employee;
import employees.Doctor;
import employees.Nurse;


public class HospitalTest {
	
	Employee employee;
	Employee employeeTwo;
	Hospital hospital;
	//Patient patient;
	
	@Before
	public void setup() {
		hospital = new Hospital();
		employee = new Nurse("Lynn", "675", "nurse");
		employeeTwo = new Doctor("Ben", "929", "doctor");
		//patient = new Patient();	
	}
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		int employeesBeforeAdding = hospital.getHospitalEmployeeSize();
		hospital.addEmployee(employee);
		int employeesAfterAdding = hospital.getHospitalEmployeeSize();
		assertEquals(employeesAfterAdding, employeesBeforeAdding + 1);
	}
	
	@Test
	public void shouldBeAbleToRemoveEmployee() {
		hospital.addEmployee(employee);
		int employeesBeforeRemoving = hospital.getHospitalEmployeeSize();
		hospital.removeEmployee(employee);
		int employeesAfterRemoving = hospital.getHospitalEmployeeSize();
		assertEquals(employeesAfterRemoving, employeesBeforeRemoving - 1);
	}
	
	@Test
	public void shouldGetAmountOfEmployees() {
		hospital.addEmployee(employee);
		hospital.addEmployee(employeeTwo);
		assertEquals(2, hospital.getHospitalEmployeeSize());
	}
	
}
