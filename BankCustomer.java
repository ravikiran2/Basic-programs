
class BankCustomer {
	String name;
	int mobile;
	int accountnumber;
	double balance;
	double depositedbalance;
	int x;
	int y;

	void deposite(int x) {
		System.out.println("name of the customer = " + name);
		System.out.println("account number = " + accountnumber);
		System.out.println("your balance = " + balance);
		System.out.println("you have deposited = " + x);
		depositedbalance = balance + x;
		System.out.println("your balance = " + depositedbalance);
	}

	void withdraw(int y) {
		System.out.println("name of the customer = " + name);
		System.out.println("account number = " + accountnumber);
		System.out.println("your balance = " + depositedbalance);
		System.out.println("withdraw amount is: " + y);
		depositedbalance = depositedbalance - y;
		System.out.println("remaining balance = " + depositedbalance);

	}

}