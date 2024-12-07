package com.work4m.bookstoreproject.sale.entity;

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
@Entity(name = "sales")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "book_id")
    Long bookId;

    @Column(name = "user_id")
    Long userId;

    @Column(name = "salesman_id")
    Long salesmanId;

    @Column(name = "sale_date")
    LocalDate saleDate;

    Long count;

    Double price;

    Long discount;

    @Column(name = "payment_id")
    Long paymentId;
}
