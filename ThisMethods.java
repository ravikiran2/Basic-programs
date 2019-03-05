
public class ThisMethods {
	int mobile = 987654321;
	String name = "Ram";
	double height = 192.55;

	ThisMethods() {
		System.out.println("this is default constructor");
		System.out.println("----------------------------");
	}

	void running(int mobile) {
		System.out.println("this is a method with one parameter");
		System.out.println(mobile);
		System.out.println(this.mobile);// instance variable
	}

	void walking() {
		System.out.println("calling another method by this method");
		running(mobile);// instance variable
		System.out.println("returning from called method");
		System.out.println("---------------------------------");
	}

// height is taken in cm
	void run(String name, double height) {
		System.out.println("method with two parameters is used here");
		System.out.println(this.name);// instance variable
		System.out.println(this.name + " and " + name + " both are different ");// using both local variable and
																				// instance variable here
		System.out.println(this.name + "'s " + "height is:- " + this.height);
		System.out.println(name + "'s " + "height is:- " + height);
		System.out.println(name + "'s " + "mobile number is:- " + mobile);// instance variable
		System.out.println(name + "'s " + "mobile number is:- " + this.mobile);

		System.out.println("------------------------------");
	}

	public static void main(String[] args) {

		ThisMethods t = new ThisMethods();
		t.walking();
		t.running(100000);
		t.run("Ravi", 176.7);
	}

}
