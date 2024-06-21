package in.basics;


class Dimension{
	public void getArea() {
		System.out.println("Hello");
	}
	
	//static method:
	public static void getName() {
		System.out.println("Area of Circle");
	}
	
	public Dimension getData() {
		return new Dimension();
	}
	
//	public int getData() {
//		return 10;
//	}
}
public class Method_I {
     
	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.getArea();
		
		Dimension.getName();
		
		Dimension var = d.getData();//object
		System.out.println(var);
		
		
		
		

	}

}
