package com.library.lms.lms.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.lms.lms.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	List<Book> findByAuthor(String author);
}
