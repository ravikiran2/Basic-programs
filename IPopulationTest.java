
public class IPopulationTest {

	 static void selectcountry(String country)
	{
		 IPopulation p=null;
		 
		if(country.equals("India"))
		{
			p=new India();
			p.maledetails(5100000);
			p.femaledetails(4800000);
			p.interests();
		}
		else if(country.equals("Germany"))
		{
			p=new Germany();
			p.maledetails(25000);
			p.femaledetails(10000);
			p.interests();
		}
		else
		{
			System.out.println("only India and Germany are taken here");
		}
	}
	public static void main(String[] args) 
	{
		selectcountry("India");
			
		
		
	}

}
