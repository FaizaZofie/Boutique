package org.cigma.boutique.model;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
public class Produit {
	@Id	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="idProd")
	private Long idProd;
	
	@Column(name="nameProd")
	private String nameProd;
	@Column(name="prixVente")
	private float prixVente;
	
	@Column(name="prixSolde")
	private float prixSolde;
	
	@Column(name="image" , columnDefinition ="LONGBLOB")
	private byte[] image;
	
	@Column(name="descImage")
	private String descImage;
	
	@Column(name="dateAjoute")
	private Date dateAjoute;
	
	@Column(name="quantite")
	private int quantite; 
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	
	
	
	
	//private Collection<LigneCmd> lignes;
	
	
	/*Constructors this.quantite = quantite;
		this.categorie = categorie;     , int quantite, Categorie categorie*/
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(Long idProd, String nameProd, float prixVente, float prixSolde, byte[] image, String descImage,
			Date dateAjoute) {
		super();
		this.idProd = idProd;
		this.nameProd = nameProd;
		this.prixVente = prixVente;
		this.prixSolde = prixSolde;
		this.image = image;
		this.descImage = descImage;
		this.dateAjoute = dateAjoute;
		
	}
	
	
	
	/*--Getters & Setters***********************************************************************/

	


	
	
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public String getNameProd() {
		return nameProd;
	}

	public void setNameProd(String nameProd) {
		this.nameProd = nameProd;
	}

	public float getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

	public float getPrixSolde() {
		return prixSolde;
	}

	public void setPrixSolde(float prixSolde) {
		this.prixSolde = prixSolde;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getDescImage() {
		return descImage;
	}

	public void setDescImage(String descImage) {
		this.descImage = descImage;
	}

	public Date getDateAjoute() {
		return dateAjoute;
	}

	public void setDateAjoute(Date dateAjoute) {
		this.dateAjoute = dateAjoute;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getIdProd() {
		return idProd;
	}
	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}
	
}
