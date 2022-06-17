package main;

import java.util.Date;
import java.util.HashSet;

public class UserManagement {
	HashSet<Lender> lenders = new HashSet<>();
    HashSet<Person> persons = new HashSet<>();
	
	void registerUser(String firstName, String lastName, Date birthday) {
		for(Person p : persons) {
			if(firstName.equals(p.firstName) && lastName.equals(p.lastName) && birthday.equals(p.birthday)) {
				System.out.println("Person already exists!");
				break;
			}
		}
		Person newPerson = new Person(firstName, lastName, birthday);
		persons.add(newPerson);
	}
	
	void createLender(String firstName, String lastName, Date birthday, String email) {
		for(Person p : persons) {
			if(firstName.equals(p.firstName) && lastName.equals(p.lastName) && birthday.equals(p.birthday)) {
				System.out.println("Person already exists!");
				break;
			}
		}
		Lender newLender = new Lender(firstName, lastName, birthday, email);
		persons.add(newLender);
	}
	
	void deactiveLender(int id) {
		for(Lender l : lenders) {
			if(id == l.id) {
				l.active = false;
			}
		}
	}
	
	boolean authenticateUser(String email, String password) {
		for(Lender l : lenders) {
			if(l.eMail != email || l.password != password) {
				return false;
			}
		}
		return true;
	}
	
	String remindUser(int id) {
		for(Lender l : lenders) {
			if(l.id == id) {
				return l.eMail;
			}
		}
		return null;
	}
}
