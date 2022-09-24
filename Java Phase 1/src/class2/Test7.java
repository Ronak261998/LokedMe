package class2;

public class Test7 {

	Test7() {

		this(30);

		System.out.println("no arg constructor");
	}

	Test7(int i) {

		this(10, 20);

		System.out.println("Arg constructor");

	}

	Test7(int i, int j) {

		System.out.println("Two arg constructor");

	}

	public static void main(String[] args) {

		Test7 t = new Test7();
	}

}
