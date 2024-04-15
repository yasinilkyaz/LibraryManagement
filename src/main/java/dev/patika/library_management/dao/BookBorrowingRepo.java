package dev.patika.library_management.dao;

import ch.qos.logback.core.util.Loader;
import dev.patika.library_management.entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowingRepo extends JpaRepository<BookBorrowing, Long> {
}
