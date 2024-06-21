package in.basics;


class A{
	A(){
		System.out.println("Current Value of this--->"+this.hashCode());
	}
}
public class This_I {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Current value of a--->"+a.hashCode());
       System.out.println("_____________________________________________");
        A obj = new A();
        System.out.println("Current value of a--->"+obj.hashCode());
	}

}
