package dev.patika.library_management.business;


import dev.patika.library_management.dao.CategoryRepo;
import dev.patika.library_management.entities.Book;
import dev.patika.library_management.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CategoryService {
    private final CategoryRepo categoryRepository;
    private final BookService bookService;

    public CategoryService(CategoryRepo categoryRepository, BookService bookService) {
        this.categoryRepository = categoryRepository;
        this.bookService = bookService;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException(id + "id li Kategori Bulunamadı !!!"));
    }

    public Category create(Category request) {
        // Name bizim için unique sayılıyor bu yüzden bu özelliğe sahip category var mı diye
        // DB den bakıyoruz yoksa create isteği atabiliriz.
        Optional<Category> isCategoryExist = categoryRepository.findByName(request.getName());

        if (isCategoryExist.isEmpty()) {
            return categoryRepository.save(request);
        }
        throw new RuntimeException("Bu kategori daha önce sisteme kayıt olmuştur !!!");
    }

    public Category update(Long id, Category request) {

        Optional<Category> categoryFromDb = categoryRepository.findById(id);

        Optional<Category> isCategoryExist = categoryRepository.findByName(request.getName());

        if (categoryFromDb.isEmpty()) {
            throw new RuntimeException(id + "Güncellemeye çalıştığınız kategori sistemde bulunamadı. !!!.");
        }

        if (isCategoryExist.isPresent()) {
            throw new RuntimeException("Bu kategori daha önce sisteme kayıt olmuştur !!!");
        }
        request.setId(id);
        return categoryRepository.save(request);
    }

    public String deleteById(Long id) {
        Optional<Category> categoryFromDb = categoryRepository.findById(id);
        List<Book> booksInCategory = bookService.findByCategoryId(id);

        if (!categoryFromDb.isPresent()) {
            return id + " id li Kategori sistemde bulunamadı!!!";
        } else if (!booksInCategory.isEmpty()) {
            return id + " id li Kategoriye ait sistemde kayıtlı kitap mevcut! Silme işlemi yapılamadı.";
        } else {
            System.out.println("book boş mu" + categoryFromDb.get().getBookList().size());
            categoryRepository.delete(categoryFromDb.get());
            return "Kategori silme işlemi başarılı";
        }
    }
}