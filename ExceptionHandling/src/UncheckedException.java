
public class UncheckedException {
public static void m1(){
	//ArithmeticException
//	int a=10;
//	int b=0;
//	int result = a/b;
//	System.out.println(result);
	
	//NumberFormatException
//	String str = "123efg";
//	System.out.println(Integer.parseInt(str));
	
	//ArrayIndexOutOfBoundException
//	int[] arr={1,2,3,4};
//	System.out.println(arr[3+1]);
	
	//StringIndexOutOfBoundException
//	String str = "Java";
//	System.out.println(str.charAt(5));
	
	//NullPointerException
	String str = null;
	System.out.println(str.length());
	
}
	public static void main(String[] args) {
		m1();

	}

}
