package dev.patika.library_management.dto.response;


import java.time.LocalDate;


public class AuthorResponse {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String country;

    public AuthorResponse() {
    }

    public AuthorResponse(Long id, String name, LocalDate birthDate, String country) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.country = country;
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
