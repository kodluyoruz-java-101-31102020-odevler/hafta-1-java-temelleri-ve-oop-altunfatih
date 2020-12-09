package question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StarAlgorithm.run();

	}
}

class StarAlgorithm {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++)
				System.out.print("*");
			System.out.println("*");
		}
		
		scanner.close();
	}
}