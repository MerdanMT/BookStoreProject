package com.work4m.bookstoreproject.book.service.bookServiceImpl;

import com.work4m.bookstoreproject.book.dto.request.BookCreateRequestDto;
import com.work4m.bookstoreproject.book.dto.request.BookUpdateRequestDto;
import com.work4m.bookstoreproject.book.mapper.BookMapper;
import com.work4m.bookstoreproject.book.dto.response.BookResponseDto;
import com.work4m.bookstoreproject.book.entity.Book;
import com.work4m.bookstoreproject.exception.subException.NotFoundException.UserNotFoundException;
import com.work4m.bookstoreproject.book.repository.BookRepository;
import com.work4m.bookstoreproject.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookResponseDto> getAllBooks() {
        return bookRepository.findAll().stream().map(bookMapper::bookToBookResponseDto).toList();
    }

    @Override
    public BookResponseDto getBookById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Book not found"));
        return bookMapper.bookToBookResponseDto(book);
    }

    @Override
    public void createBook(BookCreateRequestDto bookCreateRequestDto) {

        bookRepository.save(bookMapper.bookDtoToBook(bookCreateRequestDto));
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateBook(Long id, BookUpdateRequestDto bookUpdateRequestDto) {

        Book book = bookRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Book not found"));
        bookRepository.save(bookMapper.bookDtoToBook(book, bookUpdateRequestDto));
    }
}
