package com.projectmiage.projectone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "famille")
public class Famille {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "particularite")
	private String particularite;

	@OneToMany(targetEntity = Element.class, orphanRemoval = true, mappedBy = "familleId", fetch = FetchType.LAZY)
	private List<Element> element;


	public Famille(String nom, String particularite) {
		this.nom = nom;
		this.particularite = particularite;
	}
	
	public Famille() {

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

	/*@Override
	public String toString() {
		return "Famille [id=" + id + ", nom=" + nom + ", particularite=" + particularite + "]";
	}*/
	
}