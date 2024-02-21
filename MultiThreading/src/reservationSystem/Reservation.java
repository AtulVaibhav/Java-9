package reservationSystem;

class RailwayDB{
	static int availableSeats = 10;
}

public class Reservation {
   public synchronized void bookingTicket(String username,int requestedSeats) throws InterruptedException{
	   System.out.println("----Welcome to IRCTC-----");
	   System.out.println("Hello "+username+" .Requested seats :"+requestedSeats);
	   System.out.println("Checking for availability.Please wait....");
	   Thread.sleep(3000);
	   if(requestedSeats<=RailwayDB.availableSeats){
		   RailwayDB.availableSeats = RailwayDB.availableSeats-requestedSeats;
		   System.out.println("Booking confirmed.Wishing you a happy journey "+username);
	   }else{
		   System.out.println("Hello "+username+". Seats are not available.Sorry for inconvience");
	   }
   }
}
