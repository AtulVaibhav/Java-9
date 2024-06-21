package in.basics;

public class Method_II {
	
	  int someVar;
      static int data=100;
      int data2 = 200;
      int data3 = 300;
      
      
      Method_II(int someVar){
    	  this.someVar = someVar;
      }
      
      public static void m1(Method_II obj) {
    	// Method_II obj = new Method_II(10); 
    	 System.out.println(data);
    	 System.out.println(obj.data2);
    	 System.out.println(obj.data3);
      }
      
      
      public  void m2() {
    	 System.out.println(data);
    	 System.out.println(data2);
      }
	public static void main(String[] args) {
	  Method_II obj = new Method_II(10);
	  Method_II.m1(obj);

	}

}
