package dev.patika.library_management.dto.request;



import java.time.LocalDate;


public class BookBorrowingRequest {

    private String borrowerName;
    private String borrowerMail;
    private LocalDate borrowingDate;
    private BookForBorrowingRequest bookForBorrowingRequest;

    public BookBorrowingRequest() {
    }

    public BookBorrowingRequest(String borrowerName, String borrowerMail, LocalDate borrowingDate, BookForBorrowingRequest bookForBorrowingRequest) {
        this.borrowerName = borrowerName;
        this.borrowerMail = borrowerMail;
        this.borrowingDate = borrowingDate;
        this.bookForBorrowingRequest = bookForBorrowingRequest;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getBorrowerMail() {
        return borrowerMail;
    }

    public void setBorrowerMail(String borrowerMail) {
        this.borrowerMail = borrowerMail;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public BookForBorrowingRequest getBookForBorrowingRequest() {
        return bookForBorrowingRequest;
    }

    public void setBookForBorrowingRequest(BookForBorrowingRequest bookForBorrowingRequest) {
        this.bookForBorrowingRequest = bookForBorrowingRequest;
    }
}
