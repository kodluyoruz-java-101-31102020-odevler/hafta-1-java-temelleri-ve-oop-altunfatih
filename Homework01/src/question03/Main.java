package question03;

public class Main {

	public static void main(String[] args) {
		RandomArrayAvg.run();
	}
}

class RandomArrayAvg {
	public static void run() {
		System.out.print("Random dizinin ortalaması: ");
		System.out.println(avg());
	}
	
	public static double avg() {
		double[] randomArray = new double[10]; 

		double sum = 0;
		
		for (int i = 0; i < 10; i++) {
			randomArray[i] = (double)(Math.random() * 20);
			sum += randomArray[i];
		}
		
		double avg = sum / randomArray.length;
		
		return avg;
	}
}