package reservationSystem;

public class User extends Thread{
	private String username;
	private int requestedSeats;
	private Reservation reservation;

	public User(String username, int requestedSeats, Reservation reservation) {
		super();
		this.username = username;
		this.requestedSeats = requestedSeats;
		this.reservation = reservation;
	}
	
	public void run(){
		try {
			this.reservation.bookingTicket(this.username, this.requestedSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
