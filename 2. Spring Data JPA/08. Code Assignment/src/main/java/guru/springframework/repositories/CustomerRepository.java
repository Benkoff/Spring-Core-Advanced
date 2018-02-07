package guru.springframework.repositories;

import guru.springframework.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben Novikov on 2018-02-07
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
