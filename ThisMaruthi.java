
class ThisMaruthi {
	String comanyname = "Maruthi";
	int year = 1999;

	ThisMaruthi() {
		System.out.println("welcome");
	}

	ThisMaruthi(int year) {
		System.out.println("From" + " " + this.year + " " + "to" + " " + year);
		System.out.println(this.comanyname + " " + " is running the model");
	}

	void companydetails() {
		System.out.println(this.comanyname + " " + "details are given here");
		System.out.println(this.comanyname + " " + " started in the year " + this.year);
		System.out.println("-----------------------------------------------------");
	}

	void modeldetails(String companyname) {

		System.out.println("best model in India");
		System.out.println("and");
		System.out.println(this.comanyname + " " + "and" + " " + companyname + " " + "both are same");
		System.out.println(companyname + " " + "has became one of the best company ");
		System.out.println("------------------------------------------------");
		this.companydetails();
	}
}
