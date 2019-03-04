
 class FishingBoat extends RiverBoat
 {

	 String fishingboatname;
	 int fishingboatcapacity;
	 double fishingboatprice;
	 void fishingboatdetails()
	 {
		 System.out.println("Details of "+fishingboatname);
		 System.out.println(fishingboatname);
		 System.out.println(fishingboatname+" is used for fishing");
		 System.out.println(fishingboatname+" "+"head:- "+captain);
		 System.out.println(fishingboatname+" "+"uses"+" "+fuel);
		 System.out.println(fishingboatname+" "+"condition is "+boatcondition);
		 System.out.println(fishingboatname+"'s"+"capacity is "+fishingboatcapacity);
		 System.out.println(fishingboatname+"'s"+"price is "+fishingboatprice);
	 
	 }
}
