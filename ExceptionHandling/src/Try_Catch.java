
public class Try_Catch {
   public static void m1(int num,int num2){
	   try{
		   int result = num/num2;
		   System.out.println(result);
	   }catch(Exception ae){
		   System.out.println(ae.getClass()+" Exception handled successfully");
	   }
   }
	public static void main(String[] args) {
		m1(12,0);

	}

}
