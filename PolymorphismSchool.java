
 class PolymorphismSchool
 {
String schoolname="Milton GEM High School";
String location="bangalore";
double strength=2500;
double tenthstrength=500;

void info()
{
	System.out.println("using polymorphism");
	System.out.println("welcome");
	System.out.println("we are taking a school:- "+schoolname);
	System.out.println("--------------------------------------");
}
void details()
{
	
	System.out.println("school is located at "+location);
	System.out.println("with a strength of minimum "+strength+" students");
	System.out.println(location+" has many number of branches");
	System.out.println("---------------------------------------");
}
 }
 
 
 class TenthClass extends PolymorphismSchool
 {
	 
	String classtype="higher";
	int sections=4;
	void book()
	{
		System.out.println("students in a school");
		System.out.println("at "+location);
	}
	 
	void details()
	{
		System.out.println("the following are the details of 10th class");
		System.out.println("in "+schoolname+" this is the biggest class in "+classtype+" class");
		System.out.println("there are total"+" "+sections);
		System.out.println("in "+location+" location");
		System.out.println("-----------------------------------------------");
	} 
	 	 
}
class SecondClass extends PolymorphismSchool
{
	String classtype="secondary";
	int sections=3;
	
	
	void books()
	{
		System.out.println("students are coming more");
		System.out.println("to "+location);
	}
	void details()
	{
		System.out.println("the following are the details of 2nd class");
		System.out.println("both "+"higher classes and "+classtype+"classes are having same timings");
		System.out.println("students are divided  into"+" "+sections+" sections");
		System.out.println("in "+location+" location");
		System.out.println("----------------------------------------------");
	} 
	
}