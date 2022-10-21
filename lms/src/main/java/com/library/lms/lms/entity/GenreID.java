package com.library.lms.lms.entity;

import java.io.Serializable;
import java.util.Objects;


public class GenreID implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String genre;
	private Book book;
	
	public GenreID () {}
	
	public GenreID (String genre, Book book) {
		this.genre = genre;
		this.book = book;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		GenreID t = (GenreID) o;
		return genre.equals(t.genre) && book.equals(t.book);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genre, book);
	}
	
}
