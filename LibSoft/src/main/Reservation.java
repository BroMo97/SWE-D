package main;

import java.sql.Timestamp;

public class Reservation {
	Timestamp reservationDate;
	ReservationStatus status;
	int Id;
	int userId;
	int titleId;
	
	public Reservation(int userId, int titleId) {
        this.userId = userId;
        this.titleId = titleId;
        this.reservationDate = new Timestamp(System.currentTimeMillis());
    }

	
	void takeRentalStatus() {
		
	}
	
	void createReservationID() {
		
	}
	
	void setReservationDate(Timestamp reservationDate) {
		this.reservationDate = reservationDate;
	}
}
