package billqubeka.product.service;

import billqubeka.product.model.ProductDO;
import billqubeka.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDO getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductDO> getAllProducts() {
        return productRepository.findAll();
    }

    public void insertNewProduct(ProductDO product) {
        productRepository.save(product);
    }
}
