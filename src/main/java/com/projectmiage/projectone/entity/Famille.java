package com.projectmiage.projectone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "famille")
public class Famille {

	@Id
	private Long id;
	@Column(name = "nom")
	private String nom;
	
	public Famille(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Famille() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Famille [id=" + id + ", nom=" + nom + "]";
	}
	
}