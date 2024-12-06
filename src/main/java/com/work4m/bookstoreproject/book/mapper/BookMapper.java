package com.work4m.bookstoreproject.book.mapper;

import com.work4m.bookstoreproject.book.dto.request.BookCreateRequestDto;
import com.work4m.bookstoreproject.book.dto.request.BookUpdateRequestDto;
import com.work4m.bookstoreproject.book.dto.response.BookResponseDto;
import com.work4m.bookstoreproject.book.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookResponseDto bookToBookResponseDto(Book book);

    Book bookDtoToBook(BookCreateRequestDto bookCreateRequestDto);

    Book bookDtoToBook(@MappingTarget Book book, BookUpdateRequestDto bookUpdateRequestDto);
}
