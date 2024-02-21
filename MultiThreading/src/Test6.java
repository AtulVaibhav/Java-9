

class Shared_Resource{
	public void printNumber(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}

class Thread1 extends Thread{
	private Shared_Resource obj;
	Thread1(Shared_Resource obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printNumber();
	}
}

class Thread2 extends Thread{
	private Shared_Resource obj;
	Thread2(Shared_Resource obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printNumber();
	}
}
public class Test6 {

	public static void main(String[] args) {
	Shared_Resource obj = new Shared_Resource();
	Thread1 t1 = new Thread1(obj);
	Thread2 t2 = new Thread2(obj);
	
	t1.setName("A");
	t2.setName("B");
	System.out.println(t1.getPriority());//5
	System.out.println(t2.getPriority());//5
	
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();

	}

}
