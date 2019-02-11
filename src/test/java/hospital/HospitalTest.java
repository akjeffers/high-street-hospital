package hospital;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import employees.Employee;
import employees.Doctor;
import employees.Nurse;
import patient.Patient;


public class HospitalTest {
	
	Employee employee;
	Employee employeeTwo;
	Hospital hospital;
	Patient patient;
	//Patient patient;
	
	@Before
	public void setup() {
		
		employee = new Nurse("Lynn", "675", "nurse");
		employeeTwo = new Doctor("Ben", "929", "doctor");
		patient = new Patient("Lee", "145", 20, 10);
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
		System.out.println(hospital.getHospitalEmployeeSize());
		hospital.removeEmployee(employee);
		int employeesAfterRemoving = hospital.getHospitalEmployeeSize();
		System.out.println(hospital.getHospitalEmployeeSize());
		assertEquals(employeesAfterRemoving, employeesBeforeRemoving - 1);
	}
	
	@Test
	public void shouldGetAmountOfEmployees() {
		hospital.addEmployee(employee);
		hospital.addEmployee(employeeTwo);
		assertEquals(2, hospital.getHospitalEmployeeSize());
	}
	
	@Test
	public void shouldtickAll() {
		Hospital hospital = new Hospital();
		int bloodLevelBeforeTick = patient.getBloodLevel();
		int healthLevelBeforeTick = patient.getHealthLevel();
		int cleanlinessBeforeTick = hospital.getCleanliness();
		hospital.tick();
		int bloodLevelAfterTick = patient.getBloodLevel();
		int healthLevelAfterTick = patient.getHealthLevel();
		int cleanlinessAfterTick = hospital.getCleanliness();
		assertEquals(bloodLevelBeforeTick - 2, bloodLevelAfterTick);
		assertEquals(healthLevelBeforeTick - 3, healthLevelAfterTick);
		assertEquals(cleanlinessBeforeTick - 10, cleanlinessAfterTick);	
	}
	
}
