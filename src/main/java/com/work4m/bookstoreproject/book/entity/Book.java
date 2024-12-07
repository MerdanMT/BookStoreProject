package com.work4m.bookstoreproject.book.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "books")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "category")
    String category;

    @Column(name = "author")
    String author;

    @Column(name = "publish_date")
    LocalDate publishDate;

    @Column(name = "count")
    Long count;

    @Column(name = "price")
    Long price;

    @Column(name = "barcode")
    String barcode;

    @Column(name = "language")
    String language;

}
