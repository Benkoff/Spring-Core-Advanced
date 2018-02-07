package guru.springframework.repositories;

import guru.springframework.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben Novikov on 2018-02-07
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
