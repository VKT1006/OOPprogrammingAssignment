package business;

import java.util.ArrayList;
import java.util.List;

import Entities.Author;
import Entities.Book;
import Entities.Publisher;

public class BookService {

		
	public List<Book> filterBooksByAuthor(Author author, List<Book> books) {
		
		
		List<Book> filteredListOfBooks = new ArrayList<Book>();
		
		
		for(Book b : books) {
			
			for(Author a : b.getAuthor()) {
				
				if(a.getId() == author.getId()) {
					
					filteredListOfBooks.add(b);
					
				}				
				
			}
			
		}
		
		return filteredListOfBooks;		
		
	}
	
	public List<Book> filterBooksByPublisher(Publisher publisher, List<Book> books) {
		
		List<Book> filteredListOfBooks = new ArrayList<Book>();
		
		for(Book b : books) {
			
			if(b.getPublisher().getId() == publisher.getId()) {
				filteredListOfBooks.add(b);
			}
			
		}
		
		
		return filteredListOfBooks;
		
	}
	
	public List<Book> filterBooksAfterSpecifiedYear(int year, List<Book> books) {
		
		/*
		 * 	Burada girilen yıldan sonra basılan kitapları bir liste yapısına atıyorum. 
		 * 
		 */
		
		
		List<Book> filteredListOfBooks = new ArrayList<Book>();
		
		for(Book b : books) {
			
			if(b.getPublishYear() < year) {
				filteredListOfBooks.add(b);
			}
			
		}
		
		
		return filteredListOfBooks;
		
		
		
	}
	
	
}
