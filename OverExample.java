
class OverExample {
	static int x = 100;
	static String n = "hello";
	static String l = "pop";
	static float f = 33.5f;
	static double d = 860.09;

	void block() {
		System.out.println("hi");
	}

	void block(int x) {
		System.out.println("int parameter");
		System.out.println(x);
	}

	void block(int x, String n) {
		System.out.println("int and string parameters");
		System.out.println(x);
		System.out.println(n);
	}

	void block(float f, double d, int x) {
		System.out.println("float and double and int are parameters");
		System.out.println(f);
		System.out.println(d);
		System.out.println(x);
	}

	void block(String l) {
		System.out.println("string parameter");
		System.out.println(l);
	}

	public static void main(String[] args) {
		System.out.println("method over loading");
		OverExample o = new OverExample();
		o.block();
		System.out.println("--------------");
		o.block(x);
		System.out.println("--------------");
		o.block(x, n);
		System.out.println("--------------");
		o.block(f, d, x);
		System.out.println("--------------");
		o.block(l);
		System.out.println("---------------");

	}
}
