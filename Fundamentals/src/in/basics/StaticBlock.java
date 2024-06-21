package in.basics;


class X{
	static int a;
	static {
		a = 100;
		System.out.println("static block executed");
	}
}
public class StaticBlock {

	public static void main(String[] args) {
	
       X x = new X();
       System.out.println(x.a);
       X x1 = new X();
	}

}
