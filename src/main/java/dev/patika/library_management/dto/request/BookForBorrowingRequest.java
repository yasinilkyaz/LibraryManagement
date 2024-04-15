package dev.patika.library_management.dto.request;



public class BookForBorrowingRequest {

    private Long id;
    private String name;
    private int publicationYear;
    private int stock;

    public BookForBorrowingRequest() {
    }

    public BookForBorrowingRequest(Long id, String name, int publicationYear, int stock) {
        this.id = id;
        this.name = name;
        this.publicationYear = publicationYear;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
