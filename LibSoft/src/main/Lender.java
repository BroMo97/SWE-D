package main;

import java.util.Date;
import java.util.HashSet;

public class Lender extends Person{
	String status;
	String eMail;
	String password;
	boolean active;
	
	Lender(String firstName, String lastName, Date birthday, String email){
		super(firstName, lastName, birthday);
		status = "";
		eMail = email;
		active = true;
		password = "";
	}
	
	void reportLenderRentalHistory(int id, HashSet<Rental> rentals) {
		for(Rental r : rentals) {
			if(r.userId == id) {
				System.out.println(r.startDate + "bis" + r.dueDate);
			}
			else {
				System.out.println("Doesn't exist!");
			}
		}
	}
}
