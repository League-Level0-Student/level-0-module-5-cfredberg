package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int j = 100; j >= 0; j--) {
			System.out.println(j);
		}
		
		for (int t = 0; t <= 100; t++) {
			if (t % 2 == 0) {
				System.out.println(t);
			}
		}
		
		for (int l = 0; l <= 100; l++) {
			if (l % 2 != 0) {
				System.out.println(l);
			}
		}
		
		for (int n = 0; n <= 100; n++) {
			if (n % 2 == 0) {
				System.out.println(n + " is even!");
			}else {
				System.out.println(n + " is odd!");
			}
		}
		
		for (int c = 0; c <= 777; c++) {
			if (c % 7 == 0) {
				System.out.println(c);
			}
		}
		int year = 2009;
		for (int y = 0; y <= 11; y++) {
			System.out.println("In " + year + " i was " + y + " years old.");
			year++;
		}
		
		for (int num = 0; num < 3; num++) {
			
			for (int num1 = 0; num1 < 3; num1++) {
				System.out.println(num + " " + num1);
			}
		}
		
		for (int r = 1; r <= 7; r = r + 3) {
			System.out.println(" ");
			for (int c1 = r; c1 <= r + 2; c1++) {
				System.out.print(c1 + " ");
			}
		}
		
		for (int v = 1; v <= 100; v = v + 10) {
			System.out.println(" ");
			for (int s = v; s <= v + 9; s++) {
				System.out.print(s + " ");
			}
		}
		
		for (int number = 1; number < 7; number++) {
			System.out.println("");
			for (int number1 = 0; number1 < number; number1++) {
				System.out.print("* ");
			}
		}
		
		System.out.println(" ");
		
		for (int b = 0; b < 1; b++) {
			for (int a = 100; a >= 0; a--) {
				System.out.println(a);
			}
		}
	}
}
