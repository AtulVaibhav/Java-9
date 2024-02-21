
class Resource{
	public synchronized void print(int num) throws InterruptedException{
		System.out.println("Thread-"+Thread.currentThread().getName()+" starts execution");
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"----->"+num);
			Thread.sleep(3000);
		}
		System.out.println("Thread-"+Thread.currentThread().getName()+" ends execution");
	}
}

class TA1 extends Thread{
	 private Resource obj;
	 TA1(Resource obj){
		 this.obj = obj;
	 }
	 public void run(){
		 try {
			this.obj.print(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}

class TA2 extends Thread{
	 private Resource obj;
	 TA2(Resource obj){
		 this.obj = obj;
	 }
	 public void run(){
		 try {
			this.obj.print(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		Resource obj = new Resource();
		
		TA1 t1 = new TA1(obj);
		TA2 t2 = new TA2(obj);
		
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t1.join();
		t2.start();
		

	}

}
