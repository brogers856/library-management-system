package com.library.lms.lms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book_genre")
public class Genre implements Serializable {
	@Id
	@Column(name = "genre")
	private String genre;
	
	@Id
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "bookId", nullable = false)
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
	
	

}
