package com.work4m.bookstoreproject.book.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class BookResponseDto {

    String name;

    String category;

    String author;

    LocalDate publishDate;

    Long count;

    Long price;

    String barcode;

    String language;
}
