package patient;

public class Patient {

	private String name;
	private String idNumber;
	public int bloodLevel;
	public int healthLevel;

	public Patient(String name, String idNumber, int bloodLevel, int healthLevel) {
		this.name = name;
		this.idNumber = idNumber;
		this.bloodLevel = 20;
		this.healthLevel = 10;
	}

	public String getName() {
		return name;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void lowerBloodLevel(int i) {
		bloodLevel -= i;	
	}
	
	public void increaseHealth(int i) {
		healthLevel += i;
	}
	 
	public String toString() {
		return name + " " + bloodLevel + " " + " " + healthLevel;
	}
}