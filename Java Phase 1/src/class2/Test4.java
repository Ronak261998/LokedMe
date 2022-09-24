package class2;

public class Test4 {

	static int i = 5;
	int k;
	
	public static void main(String[]args) {
		
		int j= 10;
		System.out.println("local variable "+ j );
		System.out.println("static variable "+ i );
//		System.out.println("non static variable  "+ k );
		
		Test4 testObject = new Test4();
		
		System.out.println("non static variabel " + testObject.k );
		
		
	}

}

