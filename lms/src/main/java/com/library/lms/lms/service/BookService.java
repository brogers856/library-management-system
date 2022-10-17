package com.library.lms.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.lms.lms.book.Book;
import com.library.lms.lms.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
}
