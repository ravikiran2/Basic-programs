
public class LoopPrograms {

//print 1 to 10	
	public static void main(String[] args) {
		System.out.println("0ne to ten");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

//print 10 to 1  
		System.out.println("ten to one");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

//print even numbers
		System.out.println("even numbers");
		int c = 20;
		for (int i = 0; i <= c; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

//print odd numbers
		System.out.println("odd numbers");
		int p = 10;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

//print alternate number from 1to 20
		System.out.println("alternate number from 1 to 20");
		int y = 1;
		while (y <= 20) {
			System.out.println(y);
			y = y + 2;

		}

//print divisible by 7
		System.out.println("divisible by 7");
		for (int i = 0; i <= 50; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

	}

}
