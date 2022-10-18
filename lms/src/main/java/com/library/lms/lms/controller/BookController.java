package com.library.lms.lms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.lms.lms.entity.Book;
import com.library.lms.lms.entity.Copy;
import com.library.lms.lms.entity.Genre;
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
	
	@GetMapping("/{id}/genres")
	List<Genre> getBookGenres(@PathVariable("id") int bookId) {
		return bookService.getBookGenres(bookId);
	}
	
	@GetMapping("/genre/{genre}")
	List<Book> getBookGenres(@PathVariable("genre") String genre) {
		return bookService.getBookByGenre(genre);
	}
	
	@GetMapping("/{author}")
	public List<Book> getBookByAuthor(@PathVariable("author") String author) {
		return bookService.getBookByAuthor(author);
	}
	
	@GetMapping("/{id}/copies")
	public List<Copy> getCopies(@PathVariable("id") String bookId) {
		return bookService.getCopies(Integer.parseInt(bookId));
	}
}

