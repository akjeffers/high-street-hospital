package employees;

public class NormalJanitor extends Janitor {

	public NormalJanitor(String name, String idNumber, String position) {
		super(name, idNumber, position);

	}

	@Override
	public int calculatePay() {
		return 40000;
	}
}
