
public class Test4 extends Thread{
    public void run(){
    	//running state
    	System.out.println("Task started");
    	
    	try {
			Thread.sleep(2000);//blocked state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Task finished");
    }
    //dead state
	public static void main(String[] args) {
		System.out.println("main thread");
	   Test4 t = new Test4();//new state
	   t.start();//runnable state
      
	}

}
