package org.cigma.boutique.Controller;


import org.cigma.boutique.model.User;

import org.cigma.boutique.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@org.springframework.web.bind.annotation.RestController

public class RestController {
	@Autowired
	private UserService userService;
	

	
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username, @RequestParam String lastname, @RequestParam String email, @RequestParam String address, @RequestParam String pays,@RequestParam String ville,@RequestParam String password,@RequestParam String confirmPassword,@RequestParam String cin) {
		User user = new User(username, lastname, email, address,pays,ville,password,confirmPassword,cin);
		userService.saveUser(user);
		return "User Saved";
	}
	
  
	 
}
