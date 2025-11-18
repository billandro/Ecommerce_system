package billqubeka.product.repository;

import billqubeka.product.model.ProductDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDO, Long> {
    // custom queries go here (if needed)
}
