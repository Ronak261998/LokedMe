package class2;

public class Test6 {
	
	{
		System.out.println("Non static block 1");
	}
	
	{
		System.err.println("Non Static Block 2");
	}
	
	public static void main (String[]args) {
		
		Test6 t1 = new Test6();
		
		System.out.println("_________");
		
		Test6 t2 = new Test6();
	}

}
