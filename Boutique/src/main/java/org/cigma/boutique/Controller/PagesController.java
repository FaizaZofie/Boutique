package org.cigma.boutique.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/home")
	 public String homepage() {
		 return("/home");

	 }
	@RequestMapping("/Account")
	 public String myAccount() {
		 return("/Account");

	 }
	 
	
	 @RequestMapping("/detailProduct")
	 public String detailProduit() {
		 return("/detailProduct");

	 }
	 
	 @RequestMapping("/About")
	 public String about() {
		 return("/About");

	 }
}
