
public class StringsStarter {

	public static void main(String[] args) {

		// count the number of words in a string
		String rr = "this is the  programming language";
		int word = 0;
		for (int i = 0; i < rr.length(); i++) {
			if (rr.charAt(i) == ' ' && rr.charAt(i + 1) != ' ') {
				word++;
			}
		}
		System.out.println(word);

		// Palindrome
		String pa = "pop";
		StringBuffer sb = new StringBuffer(pa);
		System.out.println(sb);
		StringBuffer bs = sb.reverse();
		String aa = bs.toString();
		if (pa.equals(aa)) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}

		// number of vowels and consonants in a String

		String vo = "finding vowels";
		System.out.println(vo);
		int v = 0;
		int cs = 0;
		for (int i = 0; i < vo.length(); i++) {
			if (vo.charAt(i) == 'a' || vo.charAt(i) == 'e' || vo.charAt(i) == 'i' || vo.charAt(i) == 'O'
					|| vo.charAt(i) == 'u') {
				v++;
				System.out.println(vo.charAt(i));
			} else if (vo.charAt(i) > 'a' && vo.charAt(i) <= 'z') {
				cs++;

			}
		}
		System.out.println("vowels= " + v);
		System.out.println("consonants = " + cs);

		// duplicate characters in a string
		String str = "ininin";
		char[] arr = str.toCharArray();
		System.out.println(arr);
		char c;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}

		// converting string to int
		String in = "999";
		int k = Integer.valueOf(in);
		System.out.println(k);
		// converting int to string
		int e = 5555;
		String w = String.valueOf(e);
		System.out.println(w);

		// program to remove all white spaces in a string
		String spaces = " java is a programming language";
		String t = spaces.replaceAll(" ", "");
		System.out.println(t);
		String all = "   learn j a v a";
		String y = all.replaceAll(" ", "");
		System.out.println(y);

		// print a given string in upper case
		String upper = "language";
		String u = upper.toUpperCase();
		System.out.println(u);

		// print a given string in lower case
		String lower = "COMPUTER";
		String l = lower.toLowerCase();
		System.out.println(l);

		// reverse a string
		String p = "reverse";
		StringBuffer o = new StringBuffer(p);
		o.reverse();
		System.out.println(o);

		// program for swapping of two string

		String swap = "944";
		String pp = "number";
		String q = swap;
		swap = pp;
		pp = q;
		System.out.println(swap);
		System.out.println(pp);

		String r = "java";
		String m = "string";
		System.out.println(r + " " + m);
		System.out.println(m + " " + r);

	}
}
