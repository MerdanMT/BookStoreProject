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

    String name;

    String category;

    String author;

    @Column(name = "publish_date")
    LocalDate publishDate;

    Long count;

    Long price;

    String barcode;

    String language;

}
