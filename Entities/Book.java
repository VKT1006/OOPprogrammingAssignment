package Entities;

import java.util.Arrays;

public class Book {

	private int id;
	private String name;
	private Author[]  author;
	private Publisher publisher;
	private int publishYear;
	public int pageNumber;
	private double price;
	private CoverType coverType;
	
	
	public Book() {
		
	}


	public Book(int id, String name, Author[] author, Publisher publisher,
			int publishYear, int pageNumber, double price, CoverType coverType) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.coverType = coverType;
	}


	
	
	
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + Arrays.toString(author) + ", publisher=" + publisher
				+ ", publishYear=" + publishYear + ", pageNumber=" + pageNumber + ", price=" + price + ", coverType="
				+ coverType + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Author[] getAuthor() {
		return author;
	}


	public void setAuthor(Author[] author) {
		this.author = author;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}


	public int getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public CoverType getCoverType() {
		return coverType;
	}


	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}
	
	
	
		
	
}
