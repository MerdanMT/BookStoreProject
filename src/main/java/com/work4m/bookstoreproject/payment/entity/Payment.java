package com.work4m.bookstoreproject.payment.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "payments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String currency;

    @Column(nullable = false)
    Double quantity;

    @Column(nullable = false, length = 16)
    String cardNumber;

    @Column(name = "fk_user_id", nullable = false)
    Long fkUserId;

    @Column(name = "local_date_time", nullable = false)
    LocalDate localDate;

    @Column(name = "fk_book_id", nullable = false)
    Long fkBookId;

}
