package com.library.lms.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "First")
	private String first;
	@Column(name = "Last")
	private String last;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private byte[] passHash;
	@Column(name = "Admin", columnDefinition = "TINYINT(1)")
	private boolean admin;
	
	public User() {}
	
	public User(int userId, String first, String last, String username, byte[] passHash, boolean admin) {
		this.userId = userId;
		this.first = first;
		this.last = last;
		this.username = username;
		this.passHash = passHash;
		this.admin = admin;
	}
	
	public User(String first, String last, String username, byte[] passHash, boolean admin) {
		this.first = first;
		this.last = last;
		this.username = username;
		this.passHash = passHash;
		this.admin = admin;
	}

	public int getUserId() {
		return userId;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte[] getPassHash() {
		return passHash;
	}

	public void setPassHash(byte[] passHash) {
		this.passHash = passHash;
	}
	
	public boolean getAdmin() {
		return this.admin;
	}
	
}
