
public class OverLoadingRiding {
	String place = "bangalore";
	int date = 2000;
	long vehicles = 400000;

	OverLoadingRiding() {
		System.out.println("use this");
	}

	void area() {
		System.out.println(place);
		System.out.println("since" + " " + date + " " + place + " " + "changed");
	}

	void area(String city) {
		System.out.println(this.place + " " + "and" + " " + city + " " + "both are different");
	}

	void area(long vehicles) {
		System.out.println("In" + " " + place + " there are about " + vehicles + " " + "to" + " " + this.vehicles + " "
				+ "vehicles");
	}
}

class Riding extends OverLoadingRiding {
	String location = "hyderabad";
	long vehicles = 350000;

	Riding() {

		super.area("Nice");// a method in super class is called here
		System.out.println("using over riding");
		System.out.println("-----------------------------------");
	}

	void area() {
		super.area(100000);
		System.out.println("both" + " " + location + " " + super.place + " " + "are using same level.");
		System.out.println("------------------------------------------------------------");
	}

	void area(String city) {
		super.area("pune");
		System.out.println("we are taking" + " " + location + "," + super.place + "," + city);
		System.out.println("-----------------------------------------------------");
	}

}
