package loopDemo;

public class loopDemo {

	public static void main(String[] args) {

		// For
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");

		// While
		int j = 0;

		while (j <= 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("While döngüsü bitti.");

		// Do-While
		int k = 0;

		do {
			System.out.println(k);
			k++;
		} while (k <= 10);
		System.out.println("Do-While döngüsü bitti.");
	}

}
