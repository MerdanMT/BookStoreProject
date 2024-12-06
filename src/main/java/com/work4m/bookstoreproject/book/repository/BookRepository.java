package com.work4m.bookstoreproject.book.repository;

import com.work4m.bookstoreproject.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
