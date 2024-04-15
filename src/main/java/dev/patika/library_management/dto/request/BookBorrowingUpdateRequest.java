package dev.patika.library_management.dto.request;



import java.time.LocalDate;


public class BookBorrowingUpdateRequest {

    private String borrowerName;
    private LocalDate borrowingDate;
    private LocalDate returnDate;

    public BookBorrowingUpdateRequest(String borrowerName, LocalDate borrowingDate, LocalDate returnDate) {
        this.borrowerName = borrowerName;
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
    }

    public BookBorrowingUpdateRequest() {
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
}
