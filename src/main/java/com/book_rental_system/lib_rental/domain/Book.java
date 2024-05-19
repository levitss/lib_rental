package com.book_rental_system.lib_rental.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long book_id;

    @Column(name = "resv")
    private boolean resv;

    @ManyToOne
    @JoinColumn(name = "isbn")
    private BookInfo book_info;

    public Book(BookInfo book_info) {
        this.resv = false;
        this.book_info = book_info;
    }

    public void turnResv() {
        if (this.resv) {
            this.resv = false;
        }else{
            this.resv = true;
        }
    }
}
