package org.cigma.boutique.services;

import java.util.Arrays;
import java.util.HashSet;

import org.cigma.boutique.model.Role;
import org.cigma.boutique.model.User;
import org.cigma.boutique.repository.RoleRepository;
import org.cigma.boutique.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

	
	 private UserRepository userRepository;
	    private RoleRepository roleRepository;
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	    @Autowired
	    public UserService(UserRepository userRepository,
	                       RoleRepository roleRepository,
	                       BCryptPasswordEncoder bCryptPasswordEncoder) {
	        this.userRepository = userRepository;
	        this.roleRepository = roleRepository;
	        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	    }

	    public User findUserByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }

	    public void saveUser(User user) {
	        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        user.setActive(1);
	        Role userRole = roleRepository.findByRole("ADMIN");
	        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
	        userRepository.save(user);
	    }
	
}






/*private final UserRepository userRepository;
public UserService(UserRepository userRepository) {
	this.userRepository=userRepository;
}
public void saveUser(User user) {
userRepository.save(user);
}*/
