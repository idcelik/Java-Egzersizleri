package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		/// Arkadaş Sayılar:
		/// kendileri hariç, tam bölenlerinin toplamı diğerine eşit olan sayılar.
		/// En küçük arkadaş sayı : 220-284

		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}
		if (number1 == total2 && number2 == total1) {

			System.out.println("1. Sayı : " + number1 + " ve bölenleri toplamı : " + total1 +
					"\n2. Sayi : " + number2 + " ve bölenleri toplamı : " + total2 + 
					"\n\n Bu iki sayı Arkadaş Sayıdır!");
		}else {
			System.out.println("1. Sayı : " + number1 + " ve bölenleri toplamı : " + total1 +
					"\n2. Sayi : " + number2 + " ve bölenleri toplamı : " + total2 + 
					"\n\n Bu iki sayı Arkadaş Sayı Değildir!");
		}

	}

}
