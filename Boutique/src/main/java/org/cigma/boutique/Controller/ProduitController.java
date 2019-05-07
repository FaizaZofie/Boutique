					package org.cigma.boutique.Controller;


import java.util.List;

import javax.validation.Valid;

import org.cigma.boutique.model.Produit;
import org.cigma.boutique.repository.ProduitRepository;
import org.cigma.boutique.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProduitController {
	
	@Autowired
	ProduitService produitService;
	
	
	@RequestMapping("/Produit")
 public String produit() {
	 return("/Produit");
	 }	 
	 @RequestMapping("/addProduit")
	 public String addProduit() {
		 return("/addProduit");

	 }
	
	 
	
	 @RequestMapping(value="/list",method=RequestMethod.GET)
     public ModelAndView list() {
		
		
		 ModelAndView model=new ModelAndView("Produit");
		 List<Produit> produitList=produitService.getAllProduits();
		 model.addObject("produitList",produitList);
		 return model;
		 
	 }
	 
	 @RequestMapping(value="/addProduit",method=RequestMethod.GET)
  public ModelAndView addProduct() {
		 ModelAndView model=new ModelAndView();
		Produit produit= new Produit();
		
		 model.addObject("addProduit",produit);
		 model.setViewName("addProduit");
		
		 return model;
		 
	 }
	
	 @RequestMapping(value="/updateProduit/{id}",method=RequestMethod.GET)
  public ModelAndView updateProduct(@PathVariable long idProd) {
		 ModelAndView model=new ModelAndView();
		Produit produit= new Produit();
		
		model.addObject("addProduit",produit);
		 model.setViewName("addProduit");
		 
		 return model;
		 
	 }
	 
	 @RequestMapping(value="/saveProduit",method=RequestMethod.POST)
  
		 public ModelAndView saveProduit(@ModelAttribute("addProduit")Produit produit) {
		 produitService.saveOrupdate(produit);
		 
		 return new ModelAndView("redirect:/Produit");
		 
	 }
	 
	 @RequestMapping(value="/deleteProduit/{id}",method=RequestMethod.POST)
  public ModelAndView deleteProduct(@PathVariable long idProd) {
		 produitService.deleteProduit(idProd);
		 
		 return new ModelAndView("redirect:/produit");
		 
	 }
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}