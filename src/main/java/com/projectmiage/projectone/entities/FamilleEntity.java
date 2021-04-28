package com.projectmiage.projectone.entities;

import javax.persistence.*;

@Entity
@Table(name = "famille")
public class FamilleEntity {

	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long familleId;

	@Column(name = "nom")
	private String nom;

	public FamilleEntity(Long familleId, String nom) {
		this.familleId = familleId;
		this.nom = nom;
	}
	
	public FamilleEntity() {

	}

	public Long getElementId() {
		return familleId;
	}

	public void setElementId(Long familleId) {
		this.familleId = familleId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Famille [familleId=" + familleId + ", nom=" + nom + "]";
	}
	
}