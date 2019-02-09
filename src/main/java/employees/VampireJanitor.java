package employees;

public class VampireJanitor extends Janitor implements BloodDraw {

	public VampireJanitor(String name, String idNumber, String position) {
		super(name, idNumber, position);

	}

	public abstract void drawBlood();
}