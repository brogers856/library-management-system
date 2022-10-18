package com.library.lms.lms.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class GenrePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private String genre;
	@SuppressWarnings("unused")
	private int bookId;
	
	public GenrePK () {}
}
