
class FlightUserLogin {
	String userid;
	String password;
	String boarding;
	String destination;

	FlightUserLogin(String boarding, String destinaton) {
		System.out.println("boarding at = " + boarding);
		System.out.println("destination = " + destinaton);
	}

	void login() {
		System.out.println("enter your userid = " + userid);
		System.out.println("enter your password = " + password);
		if (userid == password) {
			System.out.println("login successfully");
		} else {
			System.out.println("login failed");
		}
	}

	void booking() {
		System.out.println("book your tickets");
	}

}
