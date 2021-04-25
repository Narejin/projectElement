package com.projectmiage.projectone.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.interfaces.IFamilleRepository;

@Service
public class FamilleRepository {
	
	@Autowired
	IFamilleRepository repository;
	
	public List<Famille> getFamilles() {
		return repository.findAll();
	}
	
	public Famille getFamille(Long id) {
		return repository.getOne(id);
	}
}