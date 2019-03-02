
 class Bus 
 {
  String busname;
  String busnumber;
  int servicenumber;
  String bustiming;
  String boardingpoint;
  String destination;
  
  
  Bus(String busname,String busnumber)
  {
	 
	  System.out.println("your bus = "+busname);
	  System.out.println("your busnumber = "+busnumber);
  }
  
  void busbooking()
  {
	  System.out.println("bus service number = "+servicenumber);
	  System.out.println("your bus time = "+bustiming);
	  System.out.println("you are boarding at = "+boardingpoint);
	  System.out.println("your's destination = "+destination);
  }
  
  
	 
}
