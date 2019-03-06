
class Super {
	
	String name="Ravi";
	int height=6;
	int age=20;

	
	void details()
	{
		System.out.println(name);
		System.out.println(age);
	}
	void details(String name,int age)
	{
		
		System.out.println(name);
		System.out.println(age);
	}
	
}
	class hit extends Super   {
		String name="kiran";
		int height=5;
		

		void details() {
			super.details();
			System.out.println("------------");
			System.out.println(name);
			System.out.println(super.name);
			System.out.println(super.age);
			System.out.println(height);
			System.out.println(age);//instance variable is used
			System.out.println("-------------");
		}
       void details(String name,int age)
       {
    	   super.name=name;
    	   super.details("tej", 30);
    	   System.out.println(name);
    	   System.out.println(age);
    	   System.out.println(super.name);  
    	   System.out.println(name);

       }
		

	}
