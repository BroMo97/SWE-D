package main;

import java.time.LocalDate;
import java.util.Date;

public class Controller {
	static String university = "FraUAS";
	
	private UserManagement user = new UserManagement();
	private RentalManagement rental = new RentalManagement();
	private Catalouge catalouge = new Catalouge();
	
	void registerUser(String firstName, String lastName, Date birthday, String email) {
		Lender lender = user.createLender(firstName, lastName, birthday, email);
		
		System.out.println("User is created!");
		System.out.println("\nFirstName: " + lender.firstName +
							"Lastname: " + lender.lastName +
							"\nBirthday: " + lender.birthday +
							"\nEMail: " + lender.eMail);
		
	}
	
	void createBook(String title, String isbn, String publisher, Date publicationDate, CopyLanguage language, Person author, String firstName, String lastName, Date birthday) {
		Person author2 = new Person(firstName, lastName, birthday);
		Title newTitle = catalouge.createBook(lastName, 0, publisher, publicationDate, language, author2);
		
		System.out.println("Title created!");
		System.out.println("\nTitle: " + newTitle.bookname +
						   "\nISBN: " + newTitle.isbn +
						   "\nDescription: " + newTitle.overview);
	}
	
	public static void main(String[] args) {
		System.out.println(university);
	}
}
