
public class CatchWithReturn {
   public static int m1(){
	   try{
		   String str = null;
		   return str.length();
	   }catch(Exception e){
		   return -1;
	   }
   }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
