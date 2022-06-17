package main;

import java.time.LocalDate;
import java.util.HashSet;

public class Rental {
	int id;
	int userId;
	int bookId;
	LocalDate startDate;
	LocalDate dueDate;
	int extensionCounter;
	
	public Rental(int userID, int bookID, LocalDate startDate, LocalDate dueDate, int extensionCounter) {
        this.userId = userID;
        this.bookId = bookID;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.extensionCounter = extensionCounter;
    }

	
	Rental(int bookId, int userId){
		this.bookId = bookId;
		this.userId = userId;
		this.startDate = LocalDate.now();
		this.dueDate = LocalDate.now().plusMonths(1);
		this.extensionCounter = 0;
	}
	
	void returnBookRentalHistory(int id, HashSet<Rental> rentals) {
		for(Rental r : rentals) {
			if(r.bookId == id) {
				System.out.println(r.startDate + "bis" + r.dueDate);
			}
			else {
				System.out.println("Doesn't exist!");
			}
		}
	}
}
