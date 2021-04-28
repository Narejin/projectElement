package com.projectmiage.projectone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmiage.projectone.interfaces.IElementRepository;

@Service
public class ElementService {
	
	@Autowired
	private IElementRepository repository;
}