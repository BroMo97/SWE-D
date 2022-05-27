package main;

import java.util.Date;

public class Person {
	int id;
	String firstName;
	String lastName;
	Date birthday;
	
	Person(String firstName, String lastName, Date birthday){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
}
