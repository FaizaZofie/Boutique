					package org.cigma.boutique.Controller;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.List;

import javax.servlet.http.HttpServletResponse;


import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.cigma.boutique.model.Produit;
import org.cigma.boutique.repository.ProduitRepository;
import org.cigma.boutique.services.ProduitService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProduitController {
	
	private static  String UPLOADED_FOLDER = null;

	@Autowired
	ProduitService produitService;
	@Autowired
	ProduitRepository produitRepository;
	
//Pages
	
	 @RequestMapping("/addProduit")
	 public String addProduit() {
		 return("/addProduit");

	 }
	 @RequestMapping("/Produit")
	 public String produitList(Model model) {
		 List<Produit> produit =produitService.getAllProduits();
		 model.addAttribute("produit", produit);
		 return "Produit";
	 }
	 
	 @RequestMapping("/HomeProduct")
	 public String homeproduct(Model model) {
		
		 return ("/home");
	 }
	 @RequestMapping("/HomeProducts")
	 public String homeproducts(Model model) {
		 List<Produit> produit =(List<Produit>) produitRepository.findAll();
		 model.addAttribute("produit", produit);
		 return "welcome";
	 }
	 
	 
	 //ADD ************************************************************
	 @RequestMapping(value="/addProduit",method=RequestMethod.GET)
  public ModelAndView addProduct() {
		 ModelAndView model=new ModelAndView();
		Produit produit= new Produit();
		
		 model.addObject("Produit",produit);
		 model.setViewName("addProduit");
		
		 return model;
		 
	 }
	 
	 @RequestMapping(value="/saveProduit",method=RequestMethod.POST)
	  
	 public ModelAndView saveProduit(@ModelAttribute("Produit")Produit produit) {
	 
	 produitService.saveOrupdate(produit);
	 
	 return new ModelAndView("redirect:/Produit");
	 
 }
	 
	 
	 
	//UPDATE********************************************************************
	 @RequestMapping(value="/updateProduit/{idProd}",method=RequestMethod.GET)
  public String updateProduct(@PathVariable Long idProd, Model model) {
		 model.addAttribute("Produit", produitService.getProduitById(idProd));
		 return ("update-produit");
	 }

	 
	 
	
	 //DELETE******************************************************************
	 @RequestMapping(value="/deleteProduit/{idProd}")
  public ModelAndView deleteProduct(@PathVariable long idProd) {
		 produitService.deleteProduit(idProd);
		 
		 return new ModelAndView("redirect:/Produit");
		 
	 }
	 //FILE*********************************************************************
				
		
	 
	 
	 
	 
	 
	 
	
}