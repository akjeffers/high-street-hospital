package employees;

public interface BloodDraw {
	
	public void getBloodLevel() {
		patient.getBloodLevel();
	}

	public void drawBlood() {
		bloodLevel -= 2;
	}
	
}
