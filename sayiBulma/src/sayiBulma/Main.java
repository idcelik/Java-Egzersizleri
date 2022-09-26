package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 4, 6, 7, 9, 23 };
		int number = 5;
		boolean numberFlg = false;
		
		for (int i : numbers) {
			if(i==number) {
				numberFlg=true;
				break;
			}
		}
		if(numberFlg)
		System.out.println(number + " sayısı listede var!");
		else {
			System.out.println(number + " sayısı listede yok!");	
		}

	}

}
