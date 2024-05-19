package com.book_rental_system.lib_rental.service;

import com.book_rental_system.lib_rental.domain.Book;
import com.book_rental_system.lib_rental.domain.BookInfo;
import com.book_rental_system.lib_rental.repository.BookInfoRepository;
import com.book_rental_system.lib_rental.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookInfoRepository bookInfoRepository;
    private final BookRepository bookRepository;

    public BookInfo inputBook() {
        BookInfo bookInfo = BookInfo.builder()
                .title("test")
                .kdc("800.w44")
                .author("gggg")
                .isbn(9783161484100L)
                .pub_date(LocalDateTime.now())
                .publisher("ww")
                .build();
        BookInfo save = bookInfoRepository.save(bookInfo);
        bookRepository.save(new Book(bookInfo));
        return save;
    }

}
