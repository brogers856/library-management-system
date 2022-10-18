package com.library.lms.lms.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Loan")
public class Loan {
	
	@Id
	@GeneratedValue
	@Column(name = "LoanID", nullable = false)
	private int loanId;
	@Column(name = "StartDate", nullable = false)
	private LocalDateTime startDate;
	@Column(name = "EndDate")
	private LocalDateTime endDate;
	@Column(name = "ReturnedDate")
	private LocalDateTime returnedDate;
	@Column(name = "Active", nullable = false, columnDefinition = "TINYINT(1)")
	private boolean active;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CopyID", nullable = false)
	private Copy copy;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CustomerID", nullable = false)
	private Customer customer;

	public Loan() {}
	
	public Loan(int loanId, LocalDateTime startDate, boolean active, Copy copy) {
		this.loanId = loanId;
		this.startDate = startDate;
		this.endDate = startDate.plusDays(24);
		this.active = active;
		this.copy = copy;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
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

	public int getLoanId() {
		return loanId;
	}

	public Copy getCopy() {
		return copy;
	}
	
	
	//User mapping
	
	

}
