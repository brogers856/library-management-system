package com.library.lms.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Copy")
public class Copy {

	public enum Status {
		@JsonProperty("Available")
		Available,
		@JsonProperty("Loaned")
		Loaned,
		@JsonProperty("Damaged")
		Damaged
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CopyID", nullable = false)
	private int copyId;
	@Enumerated(EnumType.STRING)
	@Column(name = "Status", columnDefinition="ENUM('Available','Loaned', 'Damaged')", nullable = false)
	private Status status;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "BookID", nullable = false)
	private Book book;
	
	public Copy() {}
	
	public Copy(int copyId, Status status, Book book) {
		this.copyId = copyId;
		this.status = status;
		this.book = book;
	}
	
	public Copy(Status status, Book book) {
		this.status = status;
		this.book = book;
	}

	public int getCopyId() {
		return copyId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	

}
