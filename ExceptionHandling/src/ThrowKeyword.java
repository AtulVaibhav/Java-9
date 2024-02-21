
public class ThrowKeyword {
  public static void m1(int num){
	  if(num<0){
		  throw new ArithmeticException();
	  }else{
		  System.out.println("Positive number");
	  }
  }
	public static void main(String[] args) {
		m1(-12);

	}

}
