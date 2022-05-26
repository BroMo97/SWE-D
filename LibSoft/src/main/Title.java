package main;

import java.util.Date;

public class Title {
	String bookname;
	String isbn;
	String publisher;
	String author;
	Date publicationDate;
	String placeOfPublication;
	CopyGenre genre;
	CopyLanguage language;
	CopyFormat format;
	int pageNumbers;
	String overview;
	String edition;
	Date dateOfListing;
	
	boolean createBibTeX() {
		return false;
	}
}
