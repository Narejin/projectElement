package com.projectmiage.projectone.services;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.FamilleEntity;
import com.projectmiage.projectone.interfaces.IFamilleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilleService {
	
	@Autowired
	IFamilleRepository repository;
	
	public List<FamilleEntity> getFamilles() {
		return this.repository.findAll();
	}
	
	public Optional<FamilleEntity> getFamille(Long id) {
		return this.repository.findById(id);
	}

	public void postFamille(FamilleEntity familleEntity) {
		this.repository.save(familleEntity);
	}

	public void updateFamille(FamilleEntity familleEntity) {
		this.repository.save(familleEntity);
	}

	public String deleteFamille(Long id) {
		String nom = this.getFamille(id).get().getNom();
		this.repository.deleteById(id);
		return nom;
	}

	public void updateParticulariteFamille(FamilleEntity familleEntity) {
		Optional<FamilleEntity> famille = this.getFamille(familleEntity.getFamilleId());
		familleEntity.setNom(famille.get().getNom());
		this.repository.save(familleEntity);
	}
}