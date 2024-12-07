package com.work4m.bookstoreproject.book.repository;

import com.work4m.bookstoreproject.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
//    @Query("SELECT r FROM Rent r WHERE r.startDate BETWEEN :startDate AND :returnDate")
//    List<Rent> findAllByStartDateBetweenAndReturnDateBetween(
//            @Param("startDate") LocalDate startDate, @Param("returnDate") LocalDate returnDate);
}
