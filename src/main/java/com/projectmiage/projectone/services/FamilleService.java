package com.projectmiage.projectone.services;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.interfaces.IFamilleRepository;

@Service
public class FamilleService {
	
	@Autowired
	IFamilleRepository repository;
	
	public List<Famille> getFamilles() {
		return repository.findAll();
	}
	
	public Optional<Famille> getFamille(Long id) {
		return repository.findById(id);
	}

	public Optional<Famille> getFamilleByNom(String nom){
		return repository.findByNom(nom);
	}

	public Famille postFamille(Famille famille) {
		return repository.save(famille);
	}

	public String deleteFamille(Long id) {
		String nom = getFamille(id).get().getNom();
		repository.deleteById(id);
		return nom;
	}

	public Famille putFamille(Famille famille) {
		return repository.save(famille);
	}

}