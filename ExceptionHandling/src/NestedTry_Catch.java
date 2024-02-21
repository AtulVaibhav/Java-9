
public class NestedTry_Catch {
    public static void m1(){
    	try{
    		System.out.println("Inside outer try-block");
    		int result = 12/4;
    		System.out.println(result);
//    		int[] arr = {1,2,3,4};
//    		System.out.println(arr[6]);
    		try{
    			System.out.println("Inside inner try-block");
    			String str = null;
    			System.out.println(str.length());
    		}catch(ArrayIndexOutOfBoundsException npe){
    			System.out.println("Exception handled by inner catch-block");
    		}
    	}catch(NullPointerException ae){
    		System.out.println("Exception handled by outer catch-block");
    	}
    	
    	System.out.println("outside nested try-catch");
    }
	public static void main(String[] args) {
		m1();

	}

}
