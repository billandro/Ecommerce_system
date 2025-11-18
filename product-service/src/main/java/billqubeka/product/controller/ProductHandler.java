package billqubeka.product.controller;

import billqubeka.product.service.ProductService;
import billqubeka.product.model.ProductDO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductHandler {

    private final ProductService productService;

    public ProductHandler(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductDO getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping()
    public List<ProductDO> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @PostMapping()
    public void addNewProduct(@RequestBody ProductDO product) {
        productService.insertNewProduct(product);
    }
}
