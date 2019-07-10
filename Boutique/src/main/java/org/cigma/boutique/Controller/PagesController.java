package org.cigma.boutique.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.cigma.boutique.model.Produit;
import org.cigma.boutique.services.ProduitServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@Autowired
	ProduitServiceImp produitServiceImp;
	@RequestMapping("/")
	public String defaultPage(Model model) {
		List<Produit> produit =produitServiceImp.allProduits();
		 model.addAttribute("produit", produit);
		return "welcome";
	}
	
	 
	 @RequestMapping("/About")
	 public String about() {
		 return("/About");

	 }
}
