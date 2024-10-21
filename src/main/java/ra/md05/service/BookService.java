package ra.md05.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md05.model.entity.Book;
import ra.md05.repository.IBookRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;


import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Page<Book> searchBooks(String keyword, Pageable pageable) {
        return bookRepository.findByNameContainingOrCategoryNameContaining(keyword, keyword, pageable);
    }
}
