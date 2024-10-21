package ra.md05.student.service.product;

import ra.md05.student.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Integer id);
    void changeProductStatus(Integer id);
    Product add(Product product);
    Product update(Product product, Integer id);
    void remove(Integer id);
    List<Product> findAllProductByCategoryId(Integer categoryId);
}
