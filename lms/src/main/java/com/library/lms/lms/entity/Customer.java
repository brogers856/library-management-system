package com.library.lms.lms.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private int customerId;
	@Column(name = "First", nullable = false)
	private String first;
	@Column(name = "Last", nullable = false)
	private String last;
	@Column(name = "JoinDate", nullable = false)
	private LocalDateTime joinDate;
	
	@OneToMany(mappedBy = "customer")
	private Set<Loan> loan;
	
	public Customer () {}
	
	public Customer (int id, String first, String last) {
		this.customerId = id;
		this.first = first;
		this.last = last;
		this.joinDate = LocalDateTime.now();
	}
	
	public Customer (String first, String last) {
		this.first = first;
		this.last = last;
		this.joinDate = LocalDateTime.now();
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public Set<Loan> getLoan() {
		return loan;
	}

	public void setLoan(Set<Loan> loan) {
		this.loan = loan;
	}
	
}
