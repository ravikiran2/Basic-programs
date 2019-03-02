
public class BusBooking {

	public static void main(String[] args) {
		System.out.println("Passengers details");
		Passenger p = new Passenger(987654321);
		p.name = "ravi";
		p.age = 20;
		p.mobilenumber = 999888998;
		p.details();
		p.name = "kiran";
		p.age = 30;
		p.details();

		System.out.println("Bus details");
		Bus b = new Bus("orange travels", "AP TS 4444");
		b.servicenumber = 4747;
		b.bustiming = "9:30 pm";
		b.boardingpoint = "Bangalore";
		b.destination = "Hyderabad";
		b.busbooking();

		System.out.println("thanking you");

	}

}
