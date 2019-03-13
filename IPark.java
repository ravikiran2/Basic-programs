
public interface IPark {

	int entryfee = 25;
	int benchs = 20;
	String place = "bangalore";

	void running();

	void walking();
}

class Gandhipark implements IPark {

	@Override
	public void running() {
		System.out.println("details of Gandhi park");
		System.out.println("in " + place);
		System.out.println("entry fee: " + entryfee);
		System.out.println("people go there for running");

	}

	@Override
	public void walking() {
		System.out.println("pay entry fee of " + entryfee + "rs");
		System.out.println("Gandhi park in " + place);
	}

}

class Nehrupark implements IPark {

	@Override
	public void running() {
		System.out.println("details of Nehru park");
		System.out.println("in " + place);
		System.out.println("entry fee: " + entryfee);
		System.out.println("nehrupark area is small in " + place);

	}

	@Override
	public void walking() {
		System.out.println("pay entry fee of " + entryfee + "rs");
		System.out.println("in Nehru park in " + place);

	}

}

class Objectss {
	public static IPark select(String park) {
		if (park.equals("Gandhipark")) {
			Gandhipark g = new Gandhipark();
			return g;
		} else if (park.equals("Nehrupark")) {
			Nehrupark n = new Nehrupark();

			return n;
		} else
			return null;
	}
}
