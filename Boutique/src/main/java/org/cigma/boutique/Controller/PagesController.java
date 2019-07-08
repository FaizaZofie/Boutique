package org.cigma.boutique.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/")
	public String defaultPage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	 
	 @RequestMapping("/About")
	 public String about() {
		 return("/About");

	 }
}
