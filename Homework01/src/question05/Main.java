package question05;

public class Main {

	public static void main(String[] args) {
		RandomNumber.run();
	}
}

class RandomNumber {
	public static void run() {
		int[] randomArray = new int[100]; 
		
		for (int i = 0; i < 100; i++)
			randomArray[i] = (int)(Math.random() * 20);
		
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] % 2 == 0)
				System.out.println("Çift: " + randomArray[i]);
			else
				System.out.println("Tek: " + randomArray[i]);
		}
	}
}