package com.projectmiage.projectone;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.services.FamilleService;

@SpringBootApplication
@RestController
public class ProjectoneApplication {
	
	@Autowired
	FamilleService familleService;
	private Famille famille;

	public static void main(String[] args) {
		SpringApplication.run(ProjectoneApplication.class, args);
	}

	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "Pour le moment, ça marche t'inquiète.";
	}

	/**@GetMapping("/helloWorld/{text}")
	public String getUserText(@PathVariable String text) {
		return text;
	}*/

	@GetMapping("/getFamilles")
	public List<Famille> getAllFamilles() {
		return familleService.getFamilles();
	}
	
	@GetMapping("/getFamilleId/{id}")
	public Optional<Famille> getOneFamille(@PathVariable Long id) {
		return familleService.getFamille(id);
	}

	@GetMapping("/getFamilleNom/{nom}")
	public Optional<Famille> getOneFamilleByNom(@PathVariable String nom) {
		return familleService.getFamilleByNom(nom);
	}

	@PostMapping("/postFamille")
	public String saveFamille(@RequestBody Famille famille) {
		this.familleService.postFamille(famille);
		return "La famille " + famille.getNom() + " a bien été ajoutée.";
	}

	@DeleteMapping("/deleteFamille/{id}")
	public String deleteFamille(@PathVariable Long id) {
		String nom = this.familleService.deleteFamille(id);
		return "La famille " + nom + " a bien été supprimée.";
	}
}

