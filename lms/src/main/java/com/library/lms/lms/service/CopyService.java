package com.library.lms.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.lms.lms.entity.Book;
import com.library.lms.lms.entity.Copy;
import com.library.lms.lms.repository.BookRepository;
import com.library.lms.lms.repository.CopyRepository;

@Service
public class CopyService {
	
	@Autowired
	private final CopyRepository copyRepository;
	
	@Autowired
	private final BookRepository bookRepository;
	
	public CopyService(CopyRepository copyRepository, BookRepository bookRepository) {
		this.copyRepository = copyRepository;
		this.bookRepository = bookRepository;
	}
	
	public Optional<Copy> getCopyById(int copyId) {
		return copyRepository.findById(copyId);
	}
	
	public void addCopy(Copy copy, int bookId) {
		Optional<Book> book = bookRepository.findById(bookId);
		copy.setBook(book.get());
		copyRepository.save(copy);
	}
	
}
