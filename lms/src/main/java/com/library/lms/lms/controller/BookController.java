package com.library.lms.lms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path = "/{id}")
	public Optional<Book> getBookById(@PathVariable("id") int bookId) {
		return bookService.getBookById(bookId);
	}
	
	@GetMapping("/{id}/genres")
	List<Genre> getBookGenres(@PathVariable("id") int bookId) {
		return bookService.getBookGenres(bookId);
	}
	
	@GetMapping("/{id}/copies")
	public List<Copy> getCopies(@PathVariable("id") String bookId) {
		return bookService.getCopies(Integer.parseInt(bookId));
	}
	
	@GetMapping(params = "genre")
	List<Book> getBookGenres(@RequestParam(name = "genre") String genre) {
		return bookService.getBookByGenre(genre);
	}
	
	@GetMapping(params = "author")
	public List<Book> getBookByAuthor(@RequestParam(name = "author") String author) {
		return bookService.getBookByAuthor(author);
	}
	
	@PostMapping
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
}

