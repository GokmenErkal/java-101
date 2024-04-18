package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int sayi = 0;
		boolean isPrime = true;
		
		if(sayi == 1) {
			System.out.println("Sayi asal değildir");
			return;
		}
		
		if(sayi < 1) {
			System.out.println("Geçersiz sayi");
			return;
		}
		
		for (int i = 2; i < sayi; i++) {
			if(sayi % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println(sayi + " sayi asal sayıdır.");
		}
		else {
			System.out.println("sayi asal değildir.");
		}
	}

}
