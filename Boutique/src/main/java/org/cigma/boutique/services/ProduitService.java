package org.cigma.boutique.services;

import java.util.List;
import java.util.Optional;

import org.cigma.boutique.model.Produit;



public interface ProduitService {
	public void saveProduit(Produit produit);
	public List<Produit> allProduits();
	public Produit getProduitById(long idProd);
	void deleteProduit(Long idProd);
	public Optional<Produit> listProductsByCategorie(Long idCategorie);
	
   
}
