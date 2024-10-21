package ra.md05.student.service.category;

import org.springframework.stereotype.Repository;
import ra.md05.student.model.entity.Category;

import java.util.List;

@Repository
public interface ICategoryService{
    List<Category> findAll();
    Category findById(Integer id);
    Category add(Category category);
    Category update(Category category, Integer id);
    void changeCategoryStatus(Integer id);
    void remove(Integer id);
}