package org.cigma.boutique.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	 @RequestMapping("/detailProduct")
	 public String detailProduit() {
		 return("/detailProduct");

	 }
}
