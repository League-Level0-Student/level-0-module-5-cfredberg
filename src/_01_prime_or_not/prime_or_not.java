package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			String num = JOptionPane.showInputDialog("Give me a number.");
			int numI = Integer.parseInt(num);
			if (numI % 2 == 0 && numI % 3 == 0 && numI % 5 == 0 && numI % 7 == 0) {
				JOptionPane.showMessageDialog(null, num + "is prime.");
			}
		}
	}
}
