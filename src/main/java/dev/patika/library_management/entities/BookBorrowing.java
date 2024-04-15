package dev.patika.library_management.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookBorrowing_id")
    private long id;

    @Column(name = "borrower_name",nullable = false)
    private String borrowerName;

    @Column(name = "borrowing_date",nullable = false)
    private LocalDate borrowingDate;

    @Column(name = "return_date",nullable = true)
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book borrowingBook;

    public BookBorrowing() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public Book getBorrowingBook() {
        return borrowingBook;
    }

    public void setBorrowingBook(Book borrowingBook) {
        this.borrowingBook = borrowingBook;
    }
}
