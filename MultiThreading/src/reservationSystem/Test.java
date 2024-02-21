package reservationSystem;

public class Test {

	public static void main(String[] args) {
		Reservation obj = new Reservation();
		User user1 = new User("Harsh",7,obj);
		User user2 = new User("Varun",3,obj);		
		user1.start();
		user2.start();

	}

}
