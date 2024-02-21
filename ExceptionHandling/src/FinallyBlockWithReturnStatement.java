
public class FinallyBlockWithReturnStatement {
    public static int m1(){
    	try{
    		int result = 12/0;
    		return 1;
    	}catch(Exception e){
    		return 2;
    	}finally{
    		return 3;
    	}
    }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
