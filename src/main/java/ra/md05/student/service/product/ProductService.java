package ra.md05.student.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md05.student.model.entity.Product;
import ra.md05.student.repository.IProductRepository;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void changeProductStatus(Integer id) {
        Product product = productRepository.findById(id).orElse(null);
        product.setStatus(false);
        productRepository.save(product);
    }

    @Override
    public Product add(Product product) {
        product.setProductId(null);
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Integer id) {
        product.setProductId(id);
        return productRepository.save(product);
    }

    @Override
    public void remove(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProductByCategoryId(Integer categoryId) {
        return productRepository.findAllProductByCategoryId(categoryId);
    }
}