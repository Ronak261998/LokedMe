package Class3;

public class Test1 {

	static int i;

	Test1() {
		i++;
	}

	public static void main(String[] args) {

		Test1 e1 = new Test1();
		Test1 e2 = new Test1();
		Test1 e3 = new Test1();
		Test1 e4 = new Test1();

		System.out.println("no of object created = " + e4.i);

	}

}
