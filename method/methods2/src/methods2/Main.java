package methods2;

public class Main {

	public static void main(String[] args) {
		insert();
		int number = addition(2, 3);
		System.out.println(number);
		int totalNumbers = multipleAddition(1, 3, 5, 3, 2, 1, 0);
		System.out.println(totalNumbers);
		int totalNumbers2 = multipleAddition();
		System.out.println(totalNumbers2);

	}

	public static void insert() {
		System.out.println("Inserted.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static int addition(int number1, int number2) {
		int total = number1 + number2;
		return total;
	}

	public static int multipleAddition(int... numbers) {
		/// Toplama işlemi için limitsiz sayı girmek istiyorsak, parametre bu şekilde
		/// düzenlenir.
		/// int array gibi çalışır.
		/// buna "variable arguments" denir.
		int total = 0;
		for (int number : numbers) {
			total += number;
		} 
		return total;
	}

}
