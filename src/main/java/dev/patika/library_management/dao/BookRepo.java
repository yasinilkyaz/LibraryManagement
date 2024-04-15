package dev.patika.library_management.dao;

import dev.patika.library_management.entities.Author;
import dev.patika.library_management.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepo extends JpaRepository<Book,Long> {
    Optional<Book> findByNameAndAuthor(String name, Author author);

    @Query("SELECT b FROM Book b JOIN b.categoryList c WHERE c.id = :categoryId")
    List<Book> findByCategoryId(Long categoryId);
}
