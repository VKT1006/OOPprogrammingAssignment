package Entities;

import java.util.Arrays;
import java.util.Objects;

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


	
	

	
	
	
	
	public Book(int id, String name, Author[] author, Publisher publisher, int publishYear, int pageNumber,
			double price, CoverType coverType) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pageNumber = pageNumber;
		this.price = price;
		this.coverType = coverType;
	}









	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(author);
		result = prime * result + Objects.hash(coverType, id, name, pageNumber, price, publishYear, publisher);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Arrays.equals(author, other.author) && coverType == other.coverType && id == other.id
				&& Objects.equals(name, other.name) && pageNumber == other.pageNumber
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publishYear == other.publishYear && Objects.equals(publisher, other.publisher);
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
