package recapDemo2;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.4, 5.1, 1.8, 1.3, 2.7, 2.4, 4.5 };

		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			total += number;
			if(max < number) {
				max = number;
			}
			System.out.println(number);
		}
		System.out.println("Toplam = "+ total);
		System.out.println("En Büyük Sayi = "+ max);
	}

}
