package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben Novikov on February 2018
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
