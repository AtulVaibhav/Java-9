
class ThreadData extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" started");
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName()+" completed");
	}
}

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+" started");
		ThreadData t1 = new ThreadData();
		t1.start();
		t1.join();
		System.out.println(Thread.currentThread().getName()+" completed");
	}

}
