package in.basics;

class Y{
	int a;
	
	static {
		System.out.println("static block executed");
	}
	
	Y(){
		System.out.println("default constructor");
	}
	{
		a = 10;
		System.out.println("object created");
	}
}


public class IIb_Block {

	public static void main(String[] args) {
		Y y =new Y();
		//Y y2 = new Y();
		

	}

}
