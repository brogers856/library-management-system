package com.library.lms.lms.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Loan")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LoanID", nullable = false)
	private int loanId;
	@Column(name = "StartDate", nullable = false)
	private LocalDateTime startDate;
	@Transient
	private LocalDateTime endDate;
	@Column(name = "ReturnedDate")
	private LocalDateTime returnedDate;
	@Column(name = "Active", nullable = false, columnDefinition = "TINYINT(1)")
	private boolean active;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CopyID")
	private Copy copy;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customer customer;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "UserID")
	private User user;
	
	public Loan() {}
	
	public Loan(int loanId, LocalDateTime startDate, boolean active, Copy copy) {
		this.loanId = loanId;
		this.startDate = startDate;
		this.active = active;
		this.copy = copy;
	}
	
	public Loan(LocalDateTime startDate, boolean active, Copy copy) {
		this.startDate = startDate;
		this.active = active;
		this.copy = copy;
	}

	public int getLoanId() {
		return loanId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return startDate.plusDays(24);
	}

	public LocalDateTime getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(LocalDateTime returnedDate) {
		this.returnedDate = returnedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Copy getCopy() {
		return copy;
	}

	public void setCopy(Copy copy) {
		this.copy = copy;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



}
