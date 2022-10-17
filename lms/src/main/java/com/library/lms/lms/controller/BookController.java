package com.library.lms.lms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.book.Book;
import com.library.lms.lms.service.BookService;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
}

