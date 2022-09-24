package class2;

public class Test9 {

	int i;
	int j;

	Test9() {

		System.out.println("Default Constructor");
	}

	Test9(int a) {

		System.out.println("Single arg constructor");

		i = a;
	}

	Test9(int a, int b) {

		System.out.println("Two arg constructor");

		i = a;
		j = b;
	}

	public static void main(String[] args) {

		Test9 t1 = new Test9(150);
		System.out.println(" i = " + t1.i);//150
		System.out.println("*********");
		Test9 t2 = new Test9(200);
		System.out.println(" i = " + t2.i);//200
		System.out.println("*********");
		Test9 t3 = new Test9(200);
		System.out.println(" i = " + t3.i);//200
		System.out.println("*********");

		Test9 t4 = new Test9(10, 20);
		System.out.println(" i = " + t4.i); //10
		System.out.println(" i = " + t4.j); //20
		System.out.println("*********");
	}

}
