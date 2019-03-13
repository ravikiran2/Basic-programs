
class Objects {
	int x = 5;
	int y = 2;
	int z;

	void addition(int x, int y) {
		z = x + y;
		System.out.println(z);
	}

	void subtraction(int x, int y) {
		z = x - y;
		System.out.println(z);
	}

	void add(Objects r) {
		x = r.x;
		y = r.y;
		z = r.x + r.y;
		System.out.println(z);

	}

	void sub(Objects r) {
		x=r.x;
		x=r.y;
		z = r.x - r.y;
		System.out.println(z);
	}

	void mul(Objects p, Objects q) {
		x = p.x;
		y = q.y;
		z = p.x * q.y;
		System.out.println(z);
	}
}
