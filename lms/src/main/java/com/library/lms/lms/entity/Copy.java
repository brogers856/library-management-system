package com.library.lms.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Copy")
public class Copy {

	@Id
	@GeneratedValue
	@Column(name = "CopyID")
	private int copyId;
	@Column(name = "Status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "BookID", nullable = false)
	private Book book;
	
	public Copy() {}
	
	public Copy(int copyId, String status, Book book) {
		this.copyId = copyId;
		this.status = status;
		this.book = book;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCopyId() {
		return copyId;
	}

	public Book getBook() {
		return book;
	}

}
