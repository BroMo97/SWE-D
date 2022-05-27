package main;

import java.util.Date;

public class Title {
	String bookname;
	long isbn;
	String publisher;
	Person author;
	Date publicationDate;
	String placeOfPublication;
	CopyGenre genre;
	CopyLanguage language;
	int pageNumbers;
	String overview;
	String edition;
	
	Title(String bookname, long isbn, String publisher, Date publicationDate, CopyLanguage language, Person author){
		this.bookname = bookname;
		this.isbn = isbn;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.language = language;
		this.author = author;
	}
	
}
