package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		/// Sayinin kendisi hariç, tam bölenleri toplamının
		/// kendisine eşit olan sayılara mükemmel sayı denir.
		/// 6 -->1,2,3 --> 1+2+3= 6 Mükemmel Sayı
		/// 5 -->1 --> Mükemmel Sayı değildir.

		int number = 6;
		int total = 0;

		for (int x = 1; x < number; x++) {
			if (number % x == 0) {
				total += x;
			}
		}
		if(total==number) {
			System.out.println(number +" mükemmel sayıdır.");
		}else {
			System.out.println(number +" mükemmel sayı değildir.");
		}

	}

}
