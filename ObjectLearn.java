
class ObjectLearn {

	int x;
	String n;
	int y;

	void work() {
		System.out.println("working here");
	}

}

class Support extends ObjectLearn {
	ObjectLearn display(ObjectLearn l, ObjectLearn t) {
		x = l.x + 15;
		n = l.n + "kiran";
		y = l.y + 20;
		return t;

	}
}
