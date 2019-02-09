package hospital;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import employees.Employee;
import employees.Nurse;


public class HospitalTest {
	
	Employee employee;
	Hospital hospital;
	//Patient patient;
	
	@Before
	public void setup() {
		hospital = new Hospital();
		employee = new Nurse(null, null, null);
		//patient = new Patient();	
	}
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		int employeesBeforeAdding = hospital.getHospitalSize();
		hospital.addEmployee(employee);
		int employeesAfterAdding = hospital.getHospitalSize();
		Assert.assertEquals(employeesAfterAdding, employeesBeforeAdding + 1);
	}
	
	@Test
	public void shouldGetAmountOfEmployees() {
		System.out.println(hospital.getHospitalSize());
	}
}
