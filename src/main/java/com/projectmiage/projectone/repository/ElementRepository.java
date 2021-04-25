package com.projectmiage.projectone.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmiage.projectone.interfaces.IElementRepository;

@Service
public class ElementRepository {
	
	@Autowired
	private IElementRepository repository;
}