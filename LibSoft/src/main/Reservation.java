package main;

import java.security.Timestamp;
import java.util.Date;

public class Reservation {
	Timestamp reservationDate;
	ReservationStatus status;
	Date dueDate;
	long reservationID;
	int lenderID;
	
	void takeRentalStatus() {
		
	}
	
	void createReservationID() {
		
	}
	
	void setReservationDate(Timestamp reservationDate) {
		this.reservationDate = reservationDate;
	}
}
