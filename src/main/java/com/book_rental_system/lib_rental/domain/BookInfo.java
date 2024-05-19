package com.book_rental_system.lib_rental.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "book_info")
public class BookInfo {
    @Id
    @Column(name = "isbn",unique = true)
    private long isbn;

    @Column(name = "kdc",nullable = false)
    private String kdc;

    @Column(name = "author",nullable = false)
    private String author;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "publisher",nullable = false)
    private String publisher;

    @Column(name = "pub_date",nullable = false)
    private LocalDateTime pub_date;

    @Builder
    public BookInfo(long isbn, String kdc, String author, String title, String publisher, LocalDateTime pub_date) {
        this.isbn = isbn;
        this.kdc = kdc;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.pub_date = pub_date;
    }
}
