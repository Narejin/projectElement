package com.projectmiage.projectone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "element")
 public class Element {
	
	@Id
	@Column (name ="z")
	private Long elementId;
	@Column (name ="nom")
	private String nom;
	@Column (name = "nom_courant")
	private String nomCourant;
	@Column	(name = "masse_atomique")
	private Integer masseAtomique;
	@ManyToOne	@JoinColumn (name = "famille_id")
	private Famille familleId;
	@Column	(name ="etat")
	private String etat;
	
	public Element(Long elementId, String nom, String nomCourant, Famille familleId, Integer masseAtomique, String etat) {
		this.elementId = elementId;
		this.nom = nom;
		this.nomCourant = nomCourant;
		this.familleId = familleId;
		this.masseAtomique = masseAtomique;
		this.etat = etat;	
	}
	
	public Element() {

	}
	
	public Long getElementId() {
		return elementId;
	}
	
	public void setElementId(Long elementId) {
		this.elementId = elementId;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNomCourant() {
		return nomCourant;
	}
	
	public void setNomCourant(String nomCourant) {
		this.nomCourant = nomCourant;
	}
	
	public Famille getFamilleId() {
		return familleId;
	}
	
	public void setFamilleId(Famille familleId) {
		this.familleId = familleId;
	}
	
	public Integer getMasseAtomique() {
		return masseAtomique;
	}
	
	public void setMasseAtomique(Integer masseAtomique) {
		this.masseAtomique = masseAtomique;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Element [z=" + elementId + ", nom=" + nom + ", nom_courant=" + nomCourant + ", masse_atomique="
				+ masseAtomique + ", famille_id=" + familleId + ", etat=" + etat + "]";
	}
}