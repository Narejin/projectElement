package com.projectmiage.projectone.repository;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.interfaces.IElementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementRepository {
	
	@Autowired
	IElementRepository repository;

	public List<Element> getElements() {
		return this.repository.findAll();
	}

	public Optional<Element> getElement(Long id) {
		return this.repository.findById(id);
	}

	public void postElement(Element element) {
		this.repository.save(element);
	}

	public void updateElement(Element element) {
		this.repository.save(element);
	}

	public String deleteElement(Long id) {
		String nom = this.getElement(id).get().getNomCourant();
		this.repository.deleteById(id);
		return nom;
	}
}