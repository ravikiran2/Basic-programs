
 class Mahindra 
{

	 String company="mahindra";
	 String headquarters="mumbai";
	 int employees=40000;
	void companydetails()
	{
		System.out.println("welcome");
		System.out.println("we are using polymorphism");
		System.out.println(company+" "+"is an Indian company.");
		System.out.println(company+"'s"+" "+"head office is in"+" "+headquarters);
		System.out.println("----------------------------------------------------");
	}
	void vehicledetails()
	{
           System.out.println(company+" "+"is a very big company.");
           System.out.println(company+" "+"has many commercial vehicles");
           System.out.println("-----------------------------------------");
	}
}
class Jeeps extends Mahindra
{
	String jeepname="kuv jeep";
	int jeepcapacity=6;
	String fuel="diesel";
	
	void jeepdetails()
	{
		System.out.println("this is a jeep");
	}
	void vehicledetails()
	{
           System.out.println(company+" "+"released one jeep model named"+" "+jeepname);
           System.out.println(super.company+" "+"announced that "+jeepname+" "+"capacity is:-"+jeepcapacity);
           System.out.println(jeepname+" "+"uses"+" "+fuel+" "+"as"+" "+"fuel");
           System.out.println("----------------------------------");
	}
	
}
	
class cars extends Mahindra
{
	String carname="scorpio";
	int carcapacity=7;
	String fuel="petrol";
	
	
	void cardetails()
	{
		System.out.println("this is a car");
	}
	
	void vehicledetails()
	{
		System.out.println(company+" "+"released"+" "+carname+" "+"in India ");
        System.out.println(carname+" "+"a big hit car in "+super.company);
        System.out.println(carname+" "+"also uses"+" "+fuel+" "+"as"+" "+"fuel");
        System.out.println("----------------------------------");
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

