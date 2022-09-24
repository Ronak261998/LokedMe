package class2;

public class Test5 {
	
	static int i = 100;
	int j = 20;
	
	
	public static void main (String[] args) {
		
		Test5 t1 = new Test5();
		System.out.println(t1.i);
		System.out.println(t1.j);
		t1.i = 200;
		
		Test5 t2 = new Test5();
		System.out.println(t2.i);
		System.out.println(t2.j);
		
		
	}

}
