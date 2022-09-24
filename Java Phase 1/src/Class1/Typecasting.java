package Class1;

public class Typecasting {

	public static void main(String[] args) {
		int a = 2;
		double b = (double) a;

		System.out.println(a);
		System.out.println(b); // Widening

		double c = 4.33;
		int d = (int) c;

		System.out.println(c);
		System.out.println(d);// Narrowing loss of data

	}

}
