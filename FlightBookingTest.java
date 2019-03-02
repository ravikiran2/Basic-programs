
public class FlightBookingTest 
{

	public static void main(String[] args)
	{
		FlightUserLogin   f=new FlightUserLogin("hyd","blr");
		FlightUserLogin g=new FlightUserLogin("chennai","blr");
		f.userid="hhh999";
		f.password="hhh999";
		f.login();
		f.booking();
		g.userid="raw";
		g.password="1234";
		g.login();
		g.booking();
		

}
}