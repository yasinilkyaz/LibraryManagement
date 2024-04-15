package dev.patika.library_management.dto.request;



import java.time.LocalDate;


public class AuthorRequest {

    private String name;
    private LocalDate birthDate;
    private String country;

    public AuthorRequest() {
    }

    public AuthorRequest(String name, LocalDate birthDate, String country) {
        this.name = name;
        this.birthDate = birthDate;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
