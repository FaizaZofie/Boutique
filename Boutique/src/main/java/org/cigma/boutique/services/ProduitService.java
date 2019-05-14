package org.cigma.boutique.services;

import java.util.List;

import org.cigma.boutique.model.Produit;



public interface ProduitService {
	public List<Produit> getAllProduits();

	Produit getProduitById(Long idProd);

	void deleteProduit(Long idProd);
	
	void saveOrupdate(Produit produit);
    
   
}
