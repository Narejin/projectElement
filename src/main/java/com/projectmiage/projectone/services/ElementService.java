package com.projectmiage.projectone.services;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.interfaces.IFamilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmiage.projectone.interfaces.IElementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ElementService {
	
	@Autowired
	private IElementRepository repository;

	public List<Element> getElements() {
		return repository.findAll();
	}

	public Optional<Element> getElement(Long id) {
		return repository.findById(id);
	}

	public Optional<Element> getElementByNom(String nom) {
		return repository.findByNom(nom);
	}

	public Optional<Element> getElementByNomCourant(String nom) {
		return repository.findByNomCourant(nom);
	}

	/*public List<Element> getElementFamille(Long familleId) {
		return repository.findByFamilleId(familleId);
	}*/

	public Element postElement(Element element) {
		return repository.save(element);
	}

	public String deleteElement(Long id) {
		String nom = getElement(id).get().getNom();
		repository.deleteById(id);
		return nom;
	}

	public Element updateElement (Element element) {
		return repository.save(element);
	}
}