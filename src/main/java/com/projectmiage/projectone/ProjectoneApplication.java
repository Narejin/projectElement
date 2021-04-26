package com.projectmiage.projectone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.repository.ElementRepository;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.repository.FamilleRepository;

@SpringBootApplication
@RestController
public class ProjectoneApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ProjectoneApplication.class, args);
	}






}

