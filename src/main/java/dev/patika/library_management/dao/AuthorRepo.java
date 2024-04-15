package dev.patika.library_management.dao;

import dev.patika.library_management.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author,Long> {
    Optional<Author> findByNameAndBirthDateAndCountry(String name, LocalDate birthDate, String country);
}
