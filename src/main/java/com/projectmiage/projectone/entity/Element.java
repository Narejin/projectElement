package com.projectmiage.projectone.entity;

import javax.persistence.*;

@Entity
@Table(name = "element")
 public class Element {
	
	@Id
	@Column(name = "z")
	private Long elementId;

	@Column(name = "nom")
	private String nom;

	@Column(name = "nom_courant")
	private String nomCourant;

	@Column(name = "masse_atomique")
	private Integer masseAtomique;

	@Column(name = "etat")
	private String etat;

	@ManyToOne
	@JoinColumn(name = "famille_id")
	private Famille familleId;

	public Element(Long elementId, String nom, String nomCourant, Integer masseAtomique, String etat, Famille familleId) {
		this.elementId = elementId;
		this.nom = nom;
		this.nomCourant = nomCourant;
		this.masseAtomique = masseAtomique;
		this.etat = etat;
		this.familleId = familleId;
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

	public Famille getFamilleId() {
		return familleId;
	}

	public void setFamilleId(Famille familleId) {
		this.familleId = familleId;
	}
}