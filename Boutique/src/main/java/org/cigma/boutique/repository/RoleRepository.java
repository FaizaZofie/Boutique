package org.cigma.boutique.repository;


import org.cigma.boutique.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	public Role findById(long role_id);	
}
