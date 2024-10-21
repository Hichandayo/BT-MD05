package ra.md05.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ra.md05.model.entity.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {
    Page<Book> findByNameContainingOrCategoryNameContaining(String name, String categoryName, Pageable pageable);
}
