


class MyThread extends Thread{
	public void run(){
		System.out.println("Inside Run() current thread name:"+Thread.currentThread().getName());
	}
}
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Inside main() current thread name:"+Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		t1.start();

	}

}
