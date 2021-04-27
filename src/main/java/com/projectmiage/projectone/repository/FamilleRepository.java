package com.projectmiage.projectone.repository;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.interfaces.IFamilleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilleRepository {
	
	@Autowired
	IFamilleRepository repository;
	
	public List<Famille> getFamilles() {
		return this.repository.findAll();
	}
	
	public Optional<Famille> getFamille(Long id) {
		return this.repository.findById(id);
	}

	public Optional<Famille> getFamilleByNom(String nom) {
		return this.repository.findByNom(nom);
	}

	public Famille postFamille(Famille famille) {
		if(this.getFamilleByNom(famille.getNom()).isPresent()) {
			return null;
		}
		return this.repository.save(famille);
	}

	public void updateFamille(Famille famille) {
		this.repository.save(famille);
	}

	public String deleteFamille(Long id) {
		String nom = this.getFamille(id).get().getNom();
		this.repository.deleteById(id);
		return nom;
	}

}