package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

public class Catalouge {
	public HashSet<Title> titles = new HashSet<>();
	
	void createBook(String bookname, long isbn, String publisher, Date publicationDate, CopyLanguage language, Person author) {
		for(Title current : titles) {
			if(current.isbn == isbn) {
				System.out.println("Book already exists!");
				break;
			}
		}
		Title newBook = new Title(bookname, isbn, publisher, publicationDate, language, author);
		titles.add(newBook);
	}
	
	boolean checkISBN(long isbn) {
		int summe = 0;
		String strIsbn = ""+isbn;
		int i, j, k, l;
		
		if(strIsbn.length() != 10) {
			return false;
		}
		else {
			for(i = 0; i < strIsbn.length(); i++) {
				k = Integer.parseInt(strIsbn.substring(i, i + 1));
				l = i + 1;
				j = l + k;
				summe += j;
			}
			return (summe % 11) == 0;
		}
	}
	
	File generateBibTex(Title title){
        String bibTextStr = "@BOOK{"+ title.author.lastName + title.publicationDate.getYear() + ",/n"
                + "Title        =" + "\" " + title.bookname + "\" ,/n"
                + "Author       =" + "\" " + title.author.firstName+ title.author.lastName + "\" ,/n"
                + "Publisher    =" + "\" " + title.publisher + "\" ,/n"
                + "ISBN         =" + "\" " + title.isbn + "\" ,/n"
                + "Release Date =" + "\" " + title.publicationDate + "\" ,/n"
                +"}";

        File file = new File(title.bookname + ".bib");
        FileWriter bibTexFile;
        try{
            bibTexFile = new FileWriter(file);
            bibTexFile.write(bibTextStr);
            bibTexFile.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
	
	void searchBook(String title) {
		System.out.println("Mathe");
	}
}
