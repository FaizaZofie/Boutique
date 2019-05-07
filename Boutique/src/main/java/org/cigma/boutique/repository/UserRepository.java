package org.cigma.boutique.repository;

import org.cigma.boutique.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByUsernameAndPassword(String username, String password);
}
