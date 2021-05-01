package com.projectmiage.projectone.services;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.ElementEntity;
import com.projectmiage.projectone.interfaces.IElementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementService {
	
	@Autowired
	IElementRepository repository;

	public List<ElementEntity> getElements() {
		return this.repository.findAll();
	}

	public Optional<ElementEntity> getElement(Long id) {
		return this.repository.findById(id);
	}

	public void postElement(ElementEntity elementEntity) {
		this.repository.save(elementEntity);
	}

	public void updateElement(ElementEntity elementEntity) {
		this.repository.save(elementEntity);
	}

	public String deleteElement(Long id) {
		String nom = this.getElement(id).get().getNomCourant();
		this.repository.deleteById(id);
		return nom;
	}

    public List<ElementEntity> getElementsByFamilleId(Long familleId) {
		return this.repository.findByFamilleId(familleId);
	}
}