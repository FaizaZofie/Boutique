package org.cigma.boutique.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cigma.boutique.model.User;
import org.cigma.boutique.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthContreoller {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/register")
	public String Registration(HttpServletRequest request) { 
		request.setAttribute("mode", "MODE_REGISTER");
		return ("registerpage");
	}
	@RequestMapping("/login")
	public String Login(HttpServletRequest request) { 
		request.setAttribute("mode", "MODE_LOGIN");
		return ("login");
	}
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute User user,HttpServletRequest request) {
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
			return "home";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "login";
			
		}
		
}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    
	    return "/welcome";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
}
