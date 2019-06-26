package org.cigma.boutique.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.cigma.boutique.model.User;
import org.cigma.boutique.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AuthContreoller {
	@Autowired
	private UserService userService;
	
	

	

	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
}
	@RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/registration");
        return modelAndView;
}
	 @RequestMapping(value = "/registration", method = RequestMethod.POST)
	    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
	        ModelAndView modelAndView = new ModelAndView();
	        User userExists = userService.findByEmail(user.getEmail());
	        if (userExists != null) {
	            bindingResult
	                    .rejectValue("email", "error.user",
	                            "There is already a user registered with the email provided");
	        }
	        if (bindingResult.hasErrors()) {
	            modelAndView.setViewName("registration");
	        } else {
	            userService.saveUser(user);
	            modelAndView.addObject("successMessage", "User has been registered successfully");
	            modelAndView.addObject("user", new User());
	            modelAndView.setViewName("registration");

	        }
	        return modelAndView;
	}
	 
	    @RequestMapping(value="/home", method = RequestMethod.GET)
	    public ModelAndView home(){
	        ModelAndView modelAndView = new ModelAndView();
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        User user = userService.findByEmail(auth.getName());
	        modelAndView.addObject("userName", "Welcome " + user.getUsername() + " " + user.getLastname() + " (" + user.getEmail() + ")");
	        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
	        modelAndView.setViewName("/home");
	        return modelAndView;
	}
	
	
	
	
	/*@RequestMapping("/login")
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
	    
	    return "/welcome";}

}*/
}