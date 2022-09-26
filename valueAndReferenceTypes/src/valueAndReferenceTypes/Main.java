package valueAndReferenceTypes;

public class Main {

	public static void main(String[] args) {

		// values, değerler
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		// int veri tipleri sadece stack'de tutulur. referansıyla iş olmaz.
		// bu sebeple işlem yapıldığı anki değerler önemlidir. Number2 : 10 verir.

		// diziler referans tiptir.
		// bu sebeple bir eşitleme yapılırsa HEAP'de ki referansları eşitlenir.
		// ve artık numbers1'de yapılan tüm değişiklikler number2'ye de etkiler. Artık
		// aynı nesne oldular.
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };

		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		numbers1[2] = 10;

		System.out.println(numbers2[2]);
	}

}
