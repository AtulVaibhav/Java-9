
public class Test1 {
   public void m1(){
	  System.out.println("Current thread :"+Thread.currentThread().getName()); 
   }
	public static void main(String[] args) {
		System.out.println("Current thread :"+Thread.currentThread().getName()); 
		Test1 obj = new Test1();
		obj.m1();

	}

}
