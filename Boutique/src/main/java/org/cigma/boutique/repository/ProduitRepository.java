package org.cigma.boutique.repository;

import org.cigma.boutique.model.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long>{

} 
	

