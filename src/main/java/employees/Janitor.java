package employees;

public abstract class Janitor extends Employee {
	
	private boolean mainTaskStatus;
	
	public Janitor(String name, String idNumber, String position) {
		super(name, idNumber, position);
		this.mainTaskStatus = false;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public void toggleWorkStatus() {
		mainTaskStatus = !mainTaskStatus;
	}	
	
}