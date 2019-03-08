
public class PolymorphismSchoolTest 
{

	public static void main(String[] args) {

		PolymorphismSchool s=new TenthClass();
		s.info();
		
		String section="SecondClass";
		if(section.equals("SecondClass"))
		{
			s=new SecondClass();
			s.details();
		}
		
		else if(section.equals("TenthClass"))
		{
			s=new TenthClass();
			s.details();
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
