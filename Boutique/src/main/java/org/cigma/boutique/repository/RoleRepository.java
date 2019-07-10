package org.cigma.boutique.repository;

import org.cigma.boutique.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends CrudRepository<Role, Integer>  {
	Role findByRole(String role);
}
