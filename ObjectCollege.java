
 class ObjectCollege {

	 String collegename="jbit";
	 int collegeid=234;
	 String collegelocation="bangalore";
	 void collegedetails()
	 {
		 System.out.println("above are few details of "+collegename);
		 System.out.println(collegename+" is a good college");
		 System.out.println("in "+collegelocation);
	 }
}
class Branch extends ObjectCollege 
{
	String branch="eee";
	int branchstrength=200;
	void branchdetails(ObjectCollege c)
	{
		System.out.println(c.collegename);
		System.out.println(c.collegename+" is located in "+c.collegelocation);
       System.out.println(c.collegename+" college has increased its "+branch+" Strength to "+branchstrength);
       System.out.println("in "+c.collegelocation);
       System.out.println("-------------------------------------");
	}
	
}
class Lab extends Branch
{
	String labname="eee lab";
	int numberoflabs=4;
	int labcapacity=30;
	void labdetails(Branch b)
	{
		System.out.println(collegename+" has "+b.branch+" branch");
		System.out.println(b.branch+" has "+numberoflabs+" "+labname+"'s");
		System.out.println(b.branch+"branch has a strength of "+b.branchstrength);
		System.out.println("so "+b.branch+" divided the labs into "+numberoflabs+" "+"with a capacity of"+" "+labcapacity);
		System.out.println("-----------------------------------------------------");
	}
}