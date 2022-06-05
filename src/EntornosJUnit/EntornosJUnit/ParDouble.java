package EntornosJUnit;

public class ParDouble {
	double n1;

	public ParDouble(double n1) {
		this.n1 = n1;
	}

	boolean espar() {
		if (n1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

