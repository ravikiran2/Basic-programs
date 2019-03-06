
class Jeep {
	int busnumber = 987;
	String bustype = "volvo";
	String vehicle = "bus";

	Jeep() {
		System.out.println(" this is called first");
	}

	Jeep(String name) {
		System.out.println(name);
	}

	void work() {
		System.out.println("using super");
	}

}

class bike extends Jeep {
	bike() {

		System.out.println("super in");
		System.out.println("-----------");
	}

	bike(String busname) {

		super("mahi");
		System.out.println("this is called second ");
		System.out.println(busname);
		System.out.println("---------------------");

	}

}

public class SuperConstructor {
	public static void main(String[] args) {
		bike b = new bike();
		bike b1 = new bike("orange");
	}
}
