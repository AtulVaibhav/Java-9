
class T1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Run() current thread name:"+Thread.currentThread().getName());
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		System.out.println("Inside Run() current thread name:"+Thread.currentThread().getName());
		T1 t = new T1();
		Thread t1 = new Thread(t);
		t1.start();
		
	}

}
