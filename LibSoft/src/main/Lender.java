package main;

import java.util.Date;

public class Lender extends Person{
	String status;
	String eMail;
	boolean active;
	
	Lender(String firstName, String lastName, Date birthday, String email){
		super(firstName, lastName, birthday);
		status = "";
		eMail = email;
		active = true;
	}
}
