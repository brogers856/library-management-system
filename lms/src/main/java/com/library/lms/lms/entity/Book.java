package com.library.lms.lms.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue
	@Column(name = "BookId", nullable = false)
	private int bookId;
	@Column(name = "Title", nullable = false)
	private String title;
	@Column(name = "PubDate", nullable = false)
	private LocalDate pubDate;
	@Column(name = "Author", nullable = false)
	private String author;
	
	@OneToMany(mappedBy = "book")
	private Set<Copy> copy;
	
	@OneToMany(mappedBy = "book")
	private Set<Genre> genre;
	
	public Book () {}
	
	public Book (int id, String title, LocalDate pubDate, String author) {
		this.bookId = id;
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
		return bookId;
	}

	public Set<Copy> getCopy() {
		return copy;
	}

	public void setCopy(Set<Copy> copy) {
		this.copy = copy;
	}

	public Set<Genre> getGenre() {
		return genre;
	}

	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}
	
	
	
	
}
