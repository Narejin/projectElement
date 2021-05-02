package com.projectmiage.projectone.entity;

import javax.persistence.*;

@Entity
@Table(name = "famille")
public class Famille {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "particularite")
	private String particularite;
	
	public Famille(Long id, String nom, String particularite) {
		this.id = id;
		this.nom = nom;
		this.particularite = particularite;
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

	public String getParticularite() {
		return particularite;
	}

	public void setParticularite(String particularite) {
		this.particularite = particularite;
	}

	@Override
	public String toString() {
		return "Famille [id=" + id + ", nom=" + nom + ", particularite=" + particularite + "]";
	}
	
}