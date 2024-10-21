package ra.md05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ra.md05.model.Product;
import ra.md05.repository.IProductRepo;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepo productRepo;

    @Transactional
    public void save(Product product) {
        productRepo.save(product);
    }
    public Product findById(Long id) {
        return productRepo.findById(id);
    }
    public List<Product> findAll() {
        return productRepo.findAll();
    }
    @Transactional
    public void delete(Long id){
        productRepo.deleteById(id);
    }
}
