
public class FinallyBlock {
    public static void m1(){
    	try{
    		int result=12/0;
    	}catch(Exception e){
    		System.out.println("Exception handled");
    	}finally{
    		System.out.println("code inside finally-block");
    	}
    }
	public static void main(String[] args) {
		m1();
	}

}
