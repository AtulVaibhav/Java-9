package in.basics;

//instance variable:declared outside the method
//object is mandatory to access instance variable
//every object maintains its own copy of instance variable

public class Variable_I {
   int data = 100;
	public static void main(String[] args) {
		//creating an object
		Variable_I obj = new Variable_I();
		Variable_I obj2 = new Variable_I();
		//accessing instance variable: objName.varName
		System.out.println(obj.data);
		
		System.out.println("____________________________");
		System.out.println("Before modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data = 200;
		
		System.out.println("after modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
