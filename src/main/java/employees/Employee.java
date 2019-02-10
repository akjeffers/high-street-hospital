package employees;

import java.util.HashMap;

public abstract class Employee {
	
	private String name;
	private String idNumber;
	private String position;
	private int pay;
	
	public Employee(String name, String idNumber, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.position = position;
		this.pay = pay;
	}
	
//	Employee surgeon = new Surgeon("John", "123", "surgeon");
//	Employee nurse = new Nurse("Bob", "222", "nurse");
//	Employee receptionist = new Receptionist("Jan", "333", "receptionist");
//	Employee vampireJanitor = new VampireJanitor("Joe", "444", "vampire janitor");
//	Employee normalJanitor = new NormalJanitor("Nancy", "555", "janitor");
		
	public String getName() {
		return name;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public String getPosition() {
		return position;
	}
	
	public int getPay() {
		return pay;
	}

	public abstract int calculatePay();
	
	@Override
	public String toString() {
		return position + " " + idNumber + " " + name;
	}

}
