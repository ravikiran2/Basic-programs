
public class ObjectLearnTest {

	public static void main(String[] args) {
		Support s=new Support();
		ObjectLearn l=new ObjectLearn();
		l.x=20;
		l.y=2;
		l.n="ravi";
		ObjectLearn p=s.display(l,s);
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.n);
	}

}
