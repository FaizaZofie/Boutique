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
import 	org.cigma.boutique.services.ProduitServiceImp;
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
	
	
	

	 @RequestMapping("/addProduit")
	 public String addProduit() {
		 return("/addProduit");

	 }
	 @Autowired
		ProduitServiceImp produitServiceImp;
		

		
		 
		 
		 
		
	//ListProduct =========================================================================================== 
		 @RequestMapping("/Produit")
		 public String produitList(Model model) {
			 List<Produit> produit =produitServiceImp.allProduits();
			 model.addAttribute("produit", produit);
			 return "Produit";
		 }
	//save product ==============================================================================================	
		@RequestMapping("/saveProduit")
		String myProduct(@RequestParam("image") MultipartFile myfile, @RequestParam("nameProd") String nameProd, @RequestParam("prixVente") float prixVente,@RequestParam("prixSolde") float prixSolde,@RequestParam("descImage") String descImage) {
			
			try {
				Produit produit = new Produit(nameProd, prixVente, prixSolde,myfile.getBytes(),descImage);
				produitServiceImp.saveProduit(produit);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return "Produit";
		}
		
		@RequestMapping("/addStudent")
		String plusProduct() {
			return "addProduit";
		}
		
		
		@RequestMapping(value ="/getProduitPhoto/{id}")
		public void getProduitPhoto(HttpServletResponse response, @PathVariable("id") int id) throws Exception {
			response.setContentType("image/jpeg");

			byte[] bytes = produitServiceImp.getProduitById(id).getImage();
			InputStream inputStream = new ByteArrayInputStream(bytes);
			IOUtils.copy(inputStream, response.getOutputStream());
		}
		
		
		 
	//UPDATE===========================================================================================================
		    
			 @RequestMapping(value="/updateProduit/{idProd}",method=RequestMethod.GET)
		  public String updateProduct(@PathVariable Long idProd, Model model) {
				 model.addAttribute("Produit", produitServiceImp.getProduitById(idProd));
				 return ("updateproduit");
			 }

			 @RequestMapping("/update")
				String update( @RequestParam("idProd") long idProd,@RequestParam("nameProd") String nameProd, @RequestParam("prixVente") float prixVente,@RequestParam("prixSolde") float prixSolde,@RequestParam("descImage") String descImage) {
				 
				Produit produit = produitServiceImp.getProduitById(idProd);	
				 produitServiceImp.saveProduit(produit);
					produit.setNameProd(nameProd);
					produit.setPrixVente(prixVente);
					produit.setPrixSolde(prixSolde);
					produit.setDescImage(descImage);
					return "Produit";
				}
				
			 
			
	 //DELETE============================================================================================================
			 @RequestMapping(value="/deleteProduit/{idProd}")
		  public ModelAndView deleteProduct(@PathVariable long idProd) {
				 produitServiceImp.deleteProduit(idProd);
				 
				 return new ModelAndView("redirect:/Produit");
				 
			 }
		 
		 
		    
	
}