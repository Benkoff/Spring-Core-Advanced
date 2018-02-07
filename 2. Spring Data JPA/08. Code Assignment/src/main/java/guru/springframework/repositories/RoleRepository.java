package guru.springframework.repositories;

import guru.springframework.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben Novikov on 2018-02-07
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
