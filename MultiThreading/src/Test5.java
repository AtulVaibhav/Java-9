
class T_A extends Thread{
	public void run(){
		for(int i=0;i<=3;i++){
			System.out.println("CurrentThread :"+Thread.currentThread().getName()+" ---->"+i);
		}
	}
}
public class Test5 {

	public static void main(String[] args) {
		T_A t1 = new T_A();
		T_A t2 = new T_A();
		
		t1.start();
		t2.start();

	}

}
