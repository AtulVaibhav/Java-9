package in.basics;
//every object is sharing the same copy of static data

public class Variable_II {
	
    static int data = 100;
    
	public static void main(String[] args) {
		//Using className
		System.out.println(Variable_II.data);
		
		//Using object:
		Variable_II obj = new Variable_II();
		Variable_II obj2 = new Variable_II();
		System.out.println("__________________________________________");
		System.out.println("Before modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data = 500;
		System.out.println("__________________________________________");
		System.out.println("After modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);

	}

}
