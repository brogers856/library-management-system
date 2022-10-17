package com.library.lms.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.lms.lms.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
