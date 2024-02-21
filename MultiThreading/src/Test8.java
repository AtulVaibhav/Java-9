class Shared_ResourceData{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i)+" ----current running thread:"+Thread.currentThread().getName());
		}
	}
}

class Thread1Data extends Thread{
	private Shared_ResourceData obj;
	Thread1Data(Shared_ResourceData obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printTable(2);
	}
}

class Thread2Data extends Thread{
	private Shared_ResourceData obj;
	Thread2Data(Shared_ResourceData obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printTable(5);
	}
}
public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		Shared_ResourceData obj = new Shared_ResourceData();
		Thread1Data t1 = new Thread1Data(obj);
		Thread2Data t2 = new Thread2Data(obj);
		
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t1.join();
		t2.start();

	}

}
