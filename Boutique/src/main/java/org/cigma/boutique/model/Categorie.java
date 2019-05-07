package org.cigma.boutique.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="categorie")
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCategorie")
	private Long idCategorie;
	@Column(name="nameCategorie")
	private String nameCategorie;
	
	@OneToMany(mappedBy = "categorie")
	private Collection<Produit> produit;

	/*Constructors*/
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Long idCategorie, String nameCategorie, Collection<Produit> produit) {
		super();
		this.idCategorie = idCategorie;
		this.nameCategorie = nameCategorie;
		this.produit = produit;
	}

	/*Getters & Setters*/
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNameCategorie() {
		return nameCategorie;
	}

	public void setNameCategorie(String nameCategorie) {
		this.nameCategorie = nameCategorie;
	}

	public Collection<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Collection<Produit> produit) {
		this.produit = produit;
	}

}
