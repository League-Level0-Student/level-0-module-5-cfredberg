package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			String num = JOptionPane.showInputDialog("Give me a number.");
			int numI = Integer.parseInt(num);
			boolean prime = true;
			for(int lessNum = numI - 1; lessNum > 1 ; lessNum--) {
				if (numI % lessNum == 0) {
					primeNot(numI);
					prime = false;
					break;
				}
			}
			if (prime) {
				prime(numI);
			}
		}
	}
	
	public static void primeNot(int noPrimeNum) {
		JOptionPane.showMessageDialog(null, noPrimeNum + " is not prime.");
	}
	
	public static void prime(int primeNum) {
		JOptionPane.showMessageDialog(null, primeNum + " is prime.");
	}
}
