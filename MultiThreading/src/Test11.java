
class Bank{
	int currentBal = 5000;
	
	public synchronized void withdraw(int requestedAmount){
		System.out.println("Start withdrawing");
		
		if(this.currentBal<requestedAmount){
			try {
				System.out.println("waiting for amount to deposit");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.currentBal = this.currentBal-requestedAmount;
		System.out.println("Amount withdrawn successfully");
		
	}
	
	public synchronized void deposit(int depositAmount){
		System.out.println("start depositing");
		this.currentBal = this.currentBal+depositAmount;
		System.out.println("amount deposited successfully");
		notify();
	}
}

class User1 extends Thread{
	private Bank bank;
	User1(Bank bank){
		this.bank = bank;
	}
	
	public void run(){
		this.bank.withdraw(10000);
	}
}


class User2 extends Thread{
	private Bank bank;
	User2(Bank bank){
		this.bank=bank;
	}
	
	public void run(){
		this.bank.deposit(6000);
	}
}

public class Test11 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		User1 user1 = new User1(bank);
		User2 user2 = new User2(bank);
		
		user1.start();
		user2.start();

	}

}
