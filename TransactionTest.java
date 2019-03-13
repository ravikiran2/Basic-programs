
public class TransactionTest {

	static	void doTransaction(String bank)
		{
			
		Transaction t=null;
		if(bank.equals("Sbi"))
				{
			        t=new Sbi();
			        t.deposite(223344555, 1000);
			        t.draw(10000,2000);

		}
		else if(bank.equals("Icici"))
		{
			t=new Icici();
			t.draw(3000, 1000);
			t.deposite(991122334, 2000);
		}
	}
public static void main(String[] args) {
	doTransaction("Sbi");
	doTransaction("Icici");
}
		
}
