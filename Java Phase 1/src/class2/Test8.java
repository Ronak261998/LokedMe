package class2;

public class Test8 {
	
	{
		System.out.println("Non static block");
	}
	int i ;
	Test8 (){
		
		i= 10;
		System.out.println("constructor");
	}
	
	public static void main (String[]args) {
		
		System.out.println("Start");
		
		Test8 t = new Test8();
		System.out.println(t.i);
		Test8 t1 = new Test8();
		System.out.println(t1.i);
	}

}
