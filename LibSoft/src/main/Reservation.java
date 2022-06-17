package main;

import java.sql.Timestamp;
import java.util.HashSet;

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
	
	void reserveBook(int titleId, int userId, HashSet<Lender> lenders) {
		UserManagement users = new UserManagement();
		Catalouge copies = new Catalouge();
		
		lenders = users.lenders;
		
		for(Lender l : lenders) {
			if(userId == l.id) {
				if(l.active) {
					for(Copy c : copies.copies) {
						if(c.copyId == titleId) {
							if(c.status != CopyStatus.Available) {
								c.status = CopyStatus.Reserved;
							}
							else {
								System.out.println("Book is already available!");
							}
						}
						else {
							System.out.println("Book doesn't exist!");
						}
					}
				}
				else {
					System.out.println("Lender is deactive!");
				}
			}
			else {
				System.out.println("Lender doesn't exist!");
			}
		}
	}

}
