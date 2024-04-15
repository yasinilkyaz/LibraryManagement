package dev.patika.library_management.dto.response;


public class PublisherResponse {

    private Long id;
    private String name;
    private Integer establishmentYear;

    public PublisherResponse() {
    }

    public PublisherResponse(Long id, String name, Integer establishmentYear) {
        this.id = id;
        this.name = name;
        this.establishmentYear = establishmentYear;
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

    public Integer getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(Integer establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
}
