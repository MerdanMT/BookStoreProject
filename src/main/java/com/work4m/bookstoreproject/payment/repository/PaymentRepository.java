package com.work4m.bookstoreproject.payment.repository;

import com.work4m.bookstoreproject.book.entity.Book;
import com.work4m.bookstoreproject.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findByFkUserId(Long userId);

    List<Payment> findByFkBookId(Long bookId);
}
