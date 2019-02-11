package patient;

public class Patient {

	private String name;
	private String idNumber;
	public int bloodLevel;
	public int healthLevel;
	private int patientTick;

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
	 
	public void increaseBlood(int i) {
		bloodLevel += i;
		
	}
	
	public void decreaseHealth (int i) {
		healthLevel -= i;
	}
	public String toString() {
		return name + "'s" + " " +"Blood Level:" + " "+ bloodLevel + " " + "and" + " " + "Health Level:" + " " + healthLevel;
	}
	
	public void tick() {
		decreaseHealth(1);
		lowerBloodLevel(1);
		
		
	}
	public int getTick() {
		return patientTick;
		
		
	
	}

}