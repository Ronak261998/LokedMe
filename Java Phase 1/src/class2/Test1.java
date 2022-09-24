package class2;

public class Test1 {
	
	public static void main (String[] args) {
		
		int i= 10; // 11 , 12
		int j= 2 + ++i + ++i + i; // 2+11+12+12=37
		
		System.out.println(i);
		System.out.println(j);
	}

}
