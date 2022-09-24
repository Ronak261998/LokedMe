package class2;

public class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id; // Java Confuse , name collision
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(10, "Ronak");

		System.out.println("Employee id is " + e.id + " Employee name is " + e.name);
		
		System.out.println("______");
		
		Employee e1 = new Employee(20, "HIMan");

		System.out.println("Employee id is " + e1.id + " Employee name is " + e1.name);
//		

	}

}
