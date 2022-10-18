package com.library.lms.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.lms.lms.entity.Book;
import com.library.lms.lms.entity.Copy;
import com.library.lms.lms.entity.Genre;
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
	
	public List<Genre> getBookGenres(int bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		return List.copyOf(book.get().getGenre());
	}
	
	public List<Book> getBookByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}
	
	public List<Book> getBookByGenre(String genre) {
		return bookRepository.findAllByGenre(genre);
	}
	
	public List<Copy> getCopies(int id) {
		Optional<Book> book = bookRepository.findById(id);
		return List.copyOf(book.get().getCopy());
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
}
