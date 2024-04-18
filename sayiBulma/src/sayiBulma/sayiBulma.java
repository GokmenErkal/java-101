package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 3, 4, 6, 8, 9, 5 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMi = true;
			}
		}

		if(varMi) {
			System.out.println("Aranan sayi bulundu.");			
		}
		else {
			System.out.println("Aranan sayi bulunamadi.");			
		}

	}

}
