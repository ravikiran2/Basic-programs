
public class BoatsTest {

	public static void main(String[] args) {
		FishingBoat f=new FishingBoat();
		f.usingboat();
		System.out.println("---------------------");
		f.jetname="JET boat";
		f.jetcapacity=1;
		f.jetprice=100000.00;
		f.jetdetails();
		System.out.println("--------------------------------");
		f.riverboatname="RIVER boat";
		f.riverboatcapacity=30;
		f.riverboatprice=50000;
		f.riverboatdetails();
		System.out.println("-----------------------------------");
		f.fishingboatname="FISHING boat";
		f.fishingboatcapacity=5;
		f.fishingboatprice=25000;
		f.fishingboatdetails();
		
	}

}
