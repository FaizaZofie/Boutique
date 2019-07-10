package org.cigma.boutique.repository;

import org.cigma.boutique.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String username);
}

