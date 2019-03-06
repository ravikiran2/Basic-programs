
class ThisSwift extends ThisMaruthi {
	double amount = 500000;
	String area = "banglore";
	String carname;

	ThisSwift() {
		// super();
		System.out.println("to all");
		System.out.println("-------------");
	}

	ThisSwift(String carname) {
		super(2010);
		System.out.println(carname);
		System.out.println("in India");
		System.out.println("---------------");
	}

	void swiftdetails() {
		super.modeldetails("maruthi suzuki");
		System.out.println("In" + " " + this.area + " " + "sales are increased so,");
		System.out.println(super.comanyname + " " + "increased the price to:- " + this.amount + "rs " + "in" + " "
				+ this.area + ".");
		System.out.println("-------------------------------------------------------------------------");
	}

	void cardetails() {
		this.swiftdetails();
		System.out.println(
				"Recently another model swift is released by " + super.comanyname + " " + "in" + " " + this.area);
		System.out.println("the price of this model is " + this.amount + "rs");
	}

}
