package in.basics;

public class Method_III {
   public static void print(int n) {
	   if(n<1) {
		   return;
	   }
	   System.out.println(n);
	   print(n-1);
   }
   
   
	public static void main(String[] args) {
		int n = 5;
		
		print(n);

	}

}
