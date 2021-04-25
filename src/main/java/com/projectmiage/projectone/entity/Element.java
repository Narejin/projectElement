package com.projectmiage.projectone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "element")
 public class Element {
	
	@Id
	private Long z;
	private String nom;
	private String nom_courant;
	private Integer masse_atomique;
	private Integer famille_id; 
	private String etat;
	
	public Element(Long z, String nom, String nom_courant, Integer famille_id, Integer masse_atomique, String etat) {
		this.z = z;
		this.nom = nom;
		this.nom_courant = nom_courant;
		this.famille_id = famille_id;
		this.masse_atomique = masse_atomique;
		this.etat = etat;	
	}
	
	public Element() {

	}
	
	public Long getZ() {
		return z;
	}
	
	public void setZ(Long z) {
		this.z = z;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom_courant() {
		return nom_courant;
	}
	
	public void setNom_courant(String nom_courant) {
		this.nom_courant = nom_courant;
	}
	
	public Integer getFamille_id() {
		return famille_id;
	}
	
	public void setFamille_id(Integer famille_id) {
		this.famille_id = famille_id;
	}
	
	public Integer getMasse_atomique() {
		return masse_atomique;
	}
	
	public void setMasse_atomique(Integer masse_atomique) {
		this.masse_atomique = masse_atomique;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Element [z=" + z + ", nom=" + nom + ", nom_courant=" + nom_courant + ", masse_atomique="
				+ masse_atomique + ", famille_id=" + famille_id + ", etat=" + etat + "]";
	}
}