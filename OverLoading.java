
public class OverLoading {

	public static void main(String[] args) {

		String e = hello("bye");
		System.out.println(e);
		String w = hello("hii ", 20);
		System.out.println(w);
		int l = hello(10, 2, 4);
		System.out.println(l);
		String[] a = { "ravi", "123", "hii" };
		hello(a);
		int[] t = { 1, 2, 3, 4, 5 };
		int [] b=hello(t);
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
	}

	public static int[] hello(int[] t) {
		for (int i = 0; i < t.length; i++) {
            t[i]=t[i]+2;
		}
		return t;
	}

	public static String[] hello(String[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		return m;

	}

	public static int hello(int s, int y, int z) {
		int l = s + y + z;
		return l;

	}

	public static String hello(String p, int a) {
		String q = p + a;
		return q;

	}

	public static String hello(String u)

	{
		return u;

	}

}
