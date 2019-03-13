  
public interface Transaction {

	public static int drawamount=500;

	boolean draw(int balance,int drawamount);
	boolean deposite(int accountnumber,int depositeamount);
}
class Sbi implements Transaction
{    int balance=5000;
	@Override
	public boolean deposite(int accountnumber,int depositeamount) 
	{
		balance=balance+depositeamount;
		System.out.println("enter accountnumber:"+accountnumber);
		System.out.println("enter amount to deposite:"+depositeamount);
		System.out.println("deposited your amount:"+depositeamount);
		System.out.println("balance after deposite:"+balance);
		return false;
	}
	
	@Override
	public boolean draw(int balance,int drawamount )
	{
		int remainingbalance=balance-drawamount;
		System.out.println("SBI");
		System.out.println("your balance:="+balance);
		System.out.println("withdraw your amount:="+drawamount);
		System.out.println("your's remainingbalance:="+remainingbalance);
		return false;
	}

	
	
}
class Icici implements Transaction
{

	@Override
	public boolean draw(int balance,int drawamount ) 
	{
		int remainingbalance=balance-drawamount;
		System.out.println("ICICI");
		System.out.println("your balance:="+balance);
		System.out.println("withdraw your amount:="+drawamount);
		System.out.println("your remainingbalance:="+remainingbalance);

		return false;
	}

	@Override
	public boolean deposite(int accountnumber,int depositeamount) 
	{
		System.out.println("enter your accountnumber:"+accountnumber);
		System.out.println("enter amount to deposite:"+depositeamount);
		System.out.println("deposited your amount:"+depositeamount);
		return false;
	}
	
}