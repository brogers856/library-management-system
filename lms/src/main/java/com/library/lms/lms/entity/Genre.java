package com.library.lms.lms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book_genre")
@IdClass(GenreID.class)
public class Genre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "genre", nullable = false)
	private String genre;

	@Id
	@JsonIgnore
	@MapsId("bookId")
	@ManyToOne
	@JoinColumn(name = "BookID", nullable = false)
	private Book book;
	
	public Genre () {}
	
	public Genre (String genre, Book book) {
		this.book = book;
		this.genre = genre;
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
	
	
}
