package dev.patika.library_management.business;


import dev.patika.library_management.dao.BookRepo;
import dev.patika.library_management.entities.Book;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {

    private final BookRepo bookRepository;

    public BookService(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book getById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException(id + "id li Kitap Bulunamadı !!!"));
    }

    @Transactional
    public Book create(Book book) {
        Optional<Book> isBookExist = bookRepository.findByNameAndAuthor(book.getName(), book.getAuthor());

        if (isBookExist.isEmpty()) {
            return this.bookRepository.save(book);
        }
        throw new RuntimeException("Bu kitap daha önce sisteme kayıt olmuştur !!!");
    }

    public Book update(Long id, Book book) {

        Optional<Book> bookFromDb = bookRepository.findById(id);

        if (bookFromDb.isEmpty()) {
            throw new RuntimeException(id + "Güncellemeye çalıştığınız kitap sistemde bulunamadı. !!!.");
        }

        book.setId(id);
        return this.bookRepository.save(book);
    }

    public void deleteById(Long id) {
        Optional<Book> bookFromDb = bookRepository.findById(id);
        if (bookFromDb.isPresent()) {
            bookRepository.delete(bookFromDb.get());
        } else {
            throw new RuntimeException(id + "id li Kitap sistemde bulunamadı !!!");
        }
    }

    public List<Book> findByCategoryId(Long id) {
        return bookRepository.findByCategoryId(id);
    }


}
