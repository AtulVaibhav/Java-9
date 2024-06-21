package in.basics;

class Box{
	//static int count=0;
	public int Box(){
		System.out.println("object created");
		//count++;
		return 10;
	}
}


public class Constructor_I {

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println(b.Box());
		Box b1 = new Box();
		Box b2 = new Box();
		//System.out.println(Box.count);
		
	}

}
