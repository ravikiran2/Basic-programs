
public class Methods 
{
	public static void display() 
	{
	}

	public static int add(int a, int b) 
	{
		int c = a + b;
		System.out.println(c); 
		return c;
	}

	public static int sub(int b, int a)
	{
		int c = a - b;
		return c;
	}
	

	public static int division()
	{
		int a = 10;
		int b = 2;
		int c = a / b;
		System.out.println(c);
		return c;

	}

	public static void main(String args[]) 
	{
		display();//without input and without output
		add(10, 20);//with input and with output
		sub(50, 200);//with input and without output
		division();//without input and with output
		  
		 
	}
	
	
	
	
	
}
