package com.book_rental_system.lib_rental.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "rental_record")
public class RentalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rent_id;
    @Column(name = "rent_time", nullable = false)
    private LocalDateTime rent_time;

    @Column(name = "return_time", nullable = false)
    private LocalDateTime return_time;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
