					package org.cigma.boutique.Controller;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.cigma.boutique.model.Produit;
import org.cigma.boutique.repository.ProduitRepository;
import org.cigma.boutique.services.ProduitService;
import org.cigma.boutique.services.ProduitServiceImp;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProduitController {
	
	@Autowired
	ProduitService produitService;
	
	@Autowired
	ProduitServiceImp produitServiceImp;

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
		 produitService.saveProduit(produit);
		 
		 return new ModelAndView("redirect:/Produit");
		 
	 }
	 
	 @RequestMapping(value="/deleteProduit/{id}",method=RequestMethod.POST)
  public ModelAndView deleteProduct(@PathVariable long idProd) {
		 produitService.deleteProduit(idProd);
		 
		 return new ModelAndView("redirect:/produit");
		 
	 }

		@RequestMapping(value ="/getProduitPhoto/{id}")
		public void getproduitImage(HttpServletResponse response, @PathVariable long idProd) throws Exception {
			response.setContentType("image/jpeg");

			byte[] bytes = produitServiceImp. getProduitById(idProd).getImage();
			InputStream inputStream = new ByteArrayInputStream(bytes);
			IOUtils.copy(inputStream, response.getOutputStream());
		}
	 
		
	 
	 
	 
	 
	 
	 
	 
	 
	
}