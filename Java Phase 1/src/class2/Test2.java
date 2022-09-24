package class2;

public class Test2 {

		public static void main(String[] args) {

			mulMethod(30 , 30);
			Test2.mulMethod(10, 20);
	}

	public static void addMethod (){

		int i = 10;
		int j = 20;
		int add = i + j;

		System.out.println("add output 	" + add);

	}

	public static void mulMethod (int a , int b){

		
		int mul = a * b;

		System.out.println("add output 	" + mul);

	}
}
