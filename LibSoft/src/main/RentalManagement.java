package main;

import java.util.HashSet;

public class RentalManagement {
	HashSet<Rental> rentals = new HashSet<>();
    HashSet<Reservation> reservations = new HashSet<>();
    UserManagement users = new UserManagement();

	
	void rentBook(int bookId, int userId) {
		for(Lender l : users.lenders) {
			if(userId == l.id) {
				if(l.active) {
					Rental newRental = new Rental(bookId, userId);
					rentals.add(newRental);
				}
			}
		}
	}
		
	void extendRental(int id) {
		for(Rental r : rentals) {
			if(r.id == id) {
				r.extensionCounter++;
			}
			System.out.println("Doesn't exist!");
		}
	}
	
	Rental returnBook(int rentalId) {
		for(Rental r : rentals) {
			if(rentalId == r.id) {
				return r;
			}
		}
		return null;
	}
	
	void reserveBook(int titleId, int userId) {
		for(Lender l : users.lenders) {
			if(userId == l.id) {
				if(l.active) {
					Reservation newReservation = new Reservation(userId, titleId);
					reservations.add(newReservation);
				}
			}
		}
	}
	
	void checkAvailability(Copy copy) {
		System.out.println(copy.status);
	}
}
