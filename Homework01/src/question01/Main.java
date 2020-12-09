package question01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Password.run();
	}
}

class Password {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		String password = "12345";
		
		System.out.print("Giriş yapabilmek için şifrenizi giriniz lütfen: ");
		String control = scanner.nextLine();
		
		if (control.equals(password))
			System.out.println("Giriş Başarılı!");
		else
			System.out.println("Giriş Başarısız.");
		
		scanner.close();
	}
}
