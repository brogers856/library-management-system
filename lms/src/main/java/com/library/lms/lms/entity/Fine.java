package com.library.lms.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Fine")
public class Fine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fineId;
	@Column(name = "FineAmount")
	private int fineAmount;
	@Column(name = "Paid", columnDefinition = "TINYINT(1)")
	private boolean paid;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customer customer;
	
	public Fine() {}

	public Fine(int fineId, int fineAmount, boolean paid, Customer customer) {
		this.fineId = fineId;
		this.fineAmount = fineAmount;
		this.paid = paid;
		this.customer = customer;
	}
	
	public Fine(int fineAmount, boolean paid, Customer customer) {
		this.fineAmount = fineAmount;
		this.paid = paid;
		this.customer = customer;
	}

	public int getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(int fineAmount) {
		this.fineAmount = fineAmount;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getFineId() {
		return fineId;
	}
	
}
