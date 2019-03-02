 class ConstructorDemo
{
	int id;
	String travelsname;
	
	
	
	 ConstructorDemo(String x)
	 {
		 travelsname=x;
	 }
	 ConstructorDemo(int x,String n)
	 {
		 id=x;
		 travelsname=n;
	 }
	 
	 void booking()
	 {
		 System.out.println(travelsname);
	 }
	 
	 
}
