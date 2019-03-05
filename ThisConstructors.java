class ThisConstructors {
	int age = 20;
	String name = "raj";
	float f = 67.f;

	ThisConstructors() {
		this("ravi");
		System.out.println("this is default constructor");
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println("---------------------------");
	}

	ThisConstructors(String name) {
		this(100, "kiran", 33.5f);
		System.out.println("1 constructor");
		System.out.println(this.age);
		System.out.println(name);
		System.out.println("---------------------------");
	}

	ThisConstructors(int age, String name, float f) {
		System.out.println("3 parameterized constructor");
		System.out.println(age);
		System.out.println(name);
		System.out.println(f);
		System.out.println(this.name);
		System.out.println(this.f);
		System.out.println("----------------------------");

	}

	void usethis() {
		System.out.println("using this-keyword in constructors");
	}

	public static void main(String[] args) {
		ThisConstructors t = new ThisConstructors();
		t.usethis();

	}

}
