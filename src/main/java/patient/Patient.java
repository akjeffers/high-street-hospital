package patient;

public class Patient {

	private String name;
	private int bloodLevel;
	private int healthLevel;

	public Patient(String name, int bloodLevel, int healthLevel) {
		this.name = name;
		this.bloodLevel = 50;
		this.healthLevel = 50;
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