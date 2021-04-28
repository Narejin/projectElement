package com.projectmiage.projectone.entity;

import javax.persistence.*;

@Entity
@Table(name = "element")
 public class ElementEntity {
	
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
	private FamilleEntity familleEntityId;

	public ElementEntity(Long elementId, String nom, String nomCourant, Integer masseAtomique, String etat, FamilleEntity famille_Entity_id) {
		this.elementId = elementId;
		this.nom = nom;
		this.nomCourant = nomCourant;
		this.masseAtomique = masseAtomique;
		this.etat = etat;
		this.familleEntityId = familleEntityId;
	}

	public ElementEntity() {

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

	public FamilleEntity getFamilleId() {
		return familleEntityId;
	}

	public void setFamilleId(FamilleEntity familleEntityId) {
		this.familleEntityId = familleEntityId;
	}
}