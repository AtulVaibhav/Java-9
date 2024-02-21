
class StationaryObjects{
	public static final String obj1 = "PEN";
	public static final String obj2 = "PAPER";
}

class TB1 extends Thread{
	public void run(){
		synchronized (StationaryObjects.obj1) {
			System.out.println(Thread.currentThread().getName()+" acquired "+StationaryObjects.obj1);
			System.out.println(Thread.currentThread().getName()+" waiting for "+StationaryObjects.obj2);
			
			synchronized (StationaryObjects.obj2) {
				System.out.println(Thread.currentThread().getName()+" acquired "+StationaryObjects.obj2);
			    System.out.println("Writing task completed");
			}
		}
	}
}

class TB2 extends Thread{
	public void run(){
		synchronized (StationaryObjects.obj1) {
			System.out.println(Thread.currentThread().getName()+" acquired "+StationaryObjects.obj1);
			System.out.println(Thread.currentThread().getName()+" waiting for "+StationaryObjects.obj2);
			
			synchronized (StationaryObjects.obj2) {
				System.out.println(Thread.currentThread().getName()+" acquired "+StationaryObjects.obj2);
			    System.out.println("Writing task completed");
			}
		}
	}
}

public class Test10 {

	public static void main(String[] args) {
		TB1 t1 = new TB1();
		TB2 t2 = new TB2();
		
		t1.setName("Thread-A");
		t2.setName("Thread-B");
		
		t1.start();
		t2.start();

	}

}
