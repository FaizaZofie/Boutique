package org.cigma.boutique.services;

import java.util.List;

import javax.transaction.Transactional;

import org.cigma.boutique.model.Produit;
import org.cigma.boutique.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProduitServiceImp implements ProduitService{

	
	
	@Autowired
	ProduitRepository produitRepository;

	
	
	

	@Override
	public List<Produit> allProduits() {
		
		return (List<Produit>) produitRepository.findAll();
	}

	@Override
	public Produit getProduitById(long idProd) {
		return produitRepository.findById(idProd).get() ;
	}
	
	
	@Override
	public void deleteProduit(Long idProd) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(idProd);
	}

	@Override
	public void saveProduit(Produit produit) {
		// TODO Auto-generated method stub
		produitRepository.save(produit);
	}

	

	
}
