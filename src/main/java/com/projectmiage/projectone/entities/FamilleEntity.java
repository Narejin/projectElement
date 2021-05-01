package com.projectmiage.projectone.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "famille")
public class FamilleEntity {

	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long familleId;

	@Column(name = "nom")
	private String nom;

	@Column(name = "particularite")
	private String particularite;

	@OneToMany(mappedBy = "familleId")
	private List<ElementEntity> elementEntityList = new ArrayList<>();

	public FamilleEntity(Long familleId, String nom, String particularite) {
		this.familleId = familleId;
		this.nom = nom;
		this.particularite = particularite;
	}
	
	public FamilleEntity() {

	}

	public Long getFamilleId() {
		return familleId;
	}

	public void setFamilleId(Long familleId) {
		this.familleId = familleId;
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
		return "FamilleEntity{" +
				"familleId=" + familleId +
				", nom='" + nom + '\'' +
				", particularite='" + particularite + '\'' +
				'}';
	}
}