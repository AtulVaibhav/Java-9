import java.sql.SQLException;

public class ThrowKeyword_II {
   public static void m1(int num){
	   if(num<0){
		   try{
		   throw new SQLException();
		   }catch(Exception e){
			   System.out.println("Exception handled");
		   }
	   }else{
		   System.out.println("Positive number");
	   }
   }
	public static void main(String[] args) {
		m1(-12);

	}

}
