
class AgeVerificationFailedException extends Exception{
	String msg;
	public AgeVerificationFailedException(String msg) {
		this.msg = msg;
	}
	public String getErrorMsg(){
		return this.msg;
	}
}

public class CustomException {
    public static void ageVerification(int age){
    	if(age<18){
    		try{
    		throw new AgeVerificationFailedException("Age verification failed");
    		}catch(AgeVerificationFailedException ae){
    			System.out.println(ae.getErrorMsg());
    		}
    	}else{
    		System.out.println("Welcome to online voting system");
    	}
    }
	public static void main(String[] args) {
		ageVerification(17);
	}

}
