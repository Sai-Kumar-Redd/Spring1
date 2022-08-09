package SprintDemo2.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import SprintDemo2.Spring.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
