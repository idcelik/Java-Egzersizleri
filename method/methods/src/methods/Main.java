package methods;

public class Main {

	public static void main(String[] args) {
		showMessage();
		showMessageByParameters("Hey, this message was created with parameter.");
	}

	public static void showMessage() {
		System.out.println("Hey, this is a method.");
	}

	public static void showMessageByParameters(String message) {
		System.out.println(message);
	}

}
