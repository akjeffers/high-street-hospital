package patient;

public class Patient {

	private String name;
	public int bloodLevel;
	public int healthLevel;

	public Patient(String name, int bloodLevel, int healthLevel) {
		this.name = name;
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
}