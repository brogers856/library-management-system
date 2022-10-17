package com.library.lms.lms.book;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	@GeneratedValue
	private int BookID;
	private String title;
	private LocalDate pubDate;
	private String author;
	
	public Book () {}
	
	public Book (int id, String title, LocalDate pubDate, String author) {
		this.BookID = id;
		this.title = title;
		this.pubDate = pubDate;
		this.author = author;
	}
	
	public Book (String title, LocalDate pubDate, String author) {
		this.title = title;
		this.pubDate = pubDate;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return BookID;
	}
}
