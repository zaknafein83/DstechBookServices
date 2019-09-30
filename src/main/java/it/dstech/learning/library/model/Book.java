package it.dstech.learning.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "year")
	private int year;
	@Column(name = "total_copy")
	private int total_copy;
	@Column(name = "free_copy")
	private int free_copy;

	public int getFree_copy() {
		return free_copy;
	}

	public void setFree_copy(int free_copy) {
		this.free_copy = free_copy;
	}

	public Book() {
	}

	public Book(Book book) {
		this.id = book.getId();
		this.title = book.getTitle();
		this.setAuthor(book.getAuthor());
		this.year = book.getYear();
		this.total_copy = book.getTotal_copy();
		this.free_copy = book.getFree_copy();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotal_copy() {
		return total_copy;
	}

	public void setTotal_copy(int total_copy) {
		this.total_copy = total_copy;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
