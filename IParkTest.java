
public class IParkTest {

	public static void main(String[] args) {

		IPark p = Objectss.select("Gandhipark");
		p.running();
		p.walking();

		System.out.println("-----------------------");
		IPark p1 = Objectss.select("Nehrupark");
		p1.running();
		p1.walking();
	}

}
