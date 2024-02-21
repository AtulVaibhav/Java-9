
public class Test_Catch_III {
   public static void m1(){
	   try{
		   String str=null;
		   System.out.println(str.length());
		   
		   int result = 12/0;
		   
	   }catch(Exception e){
		   System.out.println("Exception handled successfully");
	   }
   }
	public static void main(String[] args) {
		m1();

	}

}
