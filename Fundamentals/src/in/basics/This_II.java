package in.basics;


class B{
	int data = 29;
	public void m1() {
		//int data = 11;
		System.out.println(this.data);
	}
	
}
public class This_II {

	public static void main(String[] args) {
		B b = new B();
	    b.m1();

	}

}
