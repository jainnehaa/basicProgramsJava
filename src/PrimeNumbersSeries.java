import java.util.*;

/**
 * You are given an integer N. You need to print the series of all prime numbers
 * till N.
 * @author jainnehaa
 */

public class PrimeNumbersSeries {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = -1;
		do {
			System.out.println("\nenter number");
			N = sc.nextInt();
			printPrimeNumbers(N);
		} while (N !=0);
	}

	public static void printPrimeNumbers(int n) {
		boolean primeFlag = true;
		if (n >= 2) {
			System.out.print(2 + " ");
		}
		for (int i = 3; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primeFlag = false;
				}
			}
			if (primeFlag) {
				System.out.print(i + " ");
			}
			primeFlag = true;
		}
	}
}
