
public interface IPopulation 
{

	double male=51.23;
	double female=48.99;
	
	long maledetails(long malepopulation);
	long femaledetails(long femalepopulation);
	String interests();
}
class India implements IPopulation
{

	@Override
	public long maledetails(long malepopulation)
	{
		System.out.println("Details of male people in India");
		System.out.println("in India there are about "+male+" "+"% male people are there");
		System.out.println("almost "+malepopulation+" "+"people are male in India");
		return malepopulation ;
	}

	@Override
	public long femaledetails(long femalepopulation) 
	{
		System.out.println("Details of female people in India");
		System.out.println("in India there are about "+female+"% female people are there");
		System.out.println("almost "+femalepopulation+" "+"people are female in India");
		return femalepopulation ;
	}

	@Override
	public String interests()
	{
		System.out.println("all the "+male+"% and "+female+"% wants to live in India only");
		System.out.println("people are interested more in sports");
		return null;
	}
	
}


class Germany implements IPopulation
{

	@Override
	public long maledetails(long malepopulation)
	{
		System.out.println("Germany has "+malepopulation+"% male people are there");
		System.out.println("few in "+female+"% are working hard");
		return malepopulation ;
	}

	@Override
	public long femaledetails(long femalepopulation) 
	{
		System.out.println("in Germany there are about "+femalepopulation+"% male people are there");
		System.out.println("in this "+male+"%"+" few are doing business");
		return femalepopulation ;
	}

	@Override
	public String interests() 
	{
		System.out.println("Gemany people are interested in automobile industries");
		System.out.println("major income source of Germany is because of this");
		return null;
	}
}