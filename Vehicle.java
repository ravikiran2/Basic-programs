
class VehicleTest {
	String vehiclename;
	float maximumspeed;
	int capacity;

	void vehicledetails() {
		System.out.println("you have selected:= " + vehiclename);
		System.out.println(vehiclename + "'s maximumspeed:= " + maximumspeed + "km/h");
		System.out.println(vehiclename + "'s capacity:= " + capacity);
	}

}

class Car extends VehicleTest {
	String carname;
	int carcapacity;
	String carnumber;

	void cardetails() {
		System.out.println(vehiclename + " " + "details are given below");
		System.out.println(vehiclename + "'s name:= " + carname);
		System.out.println(carname + "'s capacity:= " + carcapacity);
		System.out.println(vehiclename + "'s" + " registration number:=  " + carnumber);
		// using vehicle class

	}
}

public class Vehicle {

	public static void main(String[] args) {

		Car C = new Car();
		C.carname = "Baleno";
		C.carcapacity = 5;
		C.carnumber = "AP TS 1234";
		C.vehiclename = "CAR";
		C.maximumspeed = 200.0F;
		C.capacity = 5;
		C.vehicledetails();
		C.cardetails();
	}

}
