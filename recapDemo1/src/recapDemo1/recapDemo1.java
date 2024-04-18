package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 29;
		int sayi2 = 24;
		int sayi3 = 92;
		
		int enBuyukSayi = sayi1;
		
		if (enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		else if(enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En büyük sayi: "+ enBuyukSayi);
	}

}
