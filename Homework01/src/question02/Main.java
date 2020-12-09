package question02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NumberUtil.run();
	}
}

class NumberUtil {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Sayıyı giriniz: ");
		int a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("2. Sayıyı giriniz: ");
		int b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("-----------------------------");
		System.out.println("Bu sayılarla hangi işlemi yapmak istiyorsunuz ? ");
		System.out.println("-----------------------------");
		System.out.println("1-Toplama\n"
				+ "2-Çarpma\n"
				+ "3-Bölme\n"
				+ "4-Çıkarma");
		System.out.print("Seçim yapınız: ");
		int select = Integer.parseInt(scanner.nextLine());
		
		switch (select) {
		case 1:
			System.out.println(sum(a, b));
			break;
		case 2:
			System.out.println(multiply(a, b));
			break;
		case 3:
			System.out.println(divide(a, b));
			break;
		case 4:
			System.out.println(sub(a, b));
			break;
		default:
			System.out.println("Geçersiz işlem numarası giriniz!!");
			break;
		}
		
		scanner.close();
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}