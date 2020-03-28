package _02_fibonacci;

public class fibonacci {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		int num2;
		System.out.println(num);
		System.out.println(num1);
		for (int i = 0; i < 6; i++) {
			num2 = num + num1;
			System.out.println(num2);
			num = num1 + num2;
			System.out.println(num);
			num1 = num2 + num;
			System.out.println(num1);
		}
	}
}
