package com.projectmiage.projectone;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.entity.Jeu;
import com.projectmiage.projectone.entity.Mot;
import com.projectmiage.projectone.services.ElementService;
import com.projectmiage.projectone.services.JeuService;
import com.projectmiage.projectone.services.MotService;
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

	@Autowired
	ElementService elementService;
	private Element element;

	@Autowired
	MotService motService;
	private Mot mot;

	@Autowired
	JeuService jeuService;
	private Jeu jeu;

	public static void main(String[] args) {
		SpringApplication.run(ProjectoneApplication.class, args);
	}

	/**
	 * Mapping test OK
	 * @return String
	 */

	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "Pour le moment, ça marche t'inquiète.";
	}

	/**
	 * Mapping de l'entité Famille
	 * @return String, Famille
	 */

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
		String nom = familleService.postFamille(famille).getNom();
		return "La famille " + nom + " a bien été ajoutée.";
	}

	@DeleteMapping("/deleteFamille/{id}")
	public String deleteFamille(@PathVariable Long id) {
		String nom = familleService.deleteFamille(id);
		return "La famille " + nom + " a bien été supprimée.";
	}

	@PutMapping("/updateFamille")
	public String putFamille (@RequestBody Famille famille) {
		String nom = familleService.putFamille(famille).getNom();
		return "La famille " + nom + " a bien été mise à jour.";
	}

	/**
	 * Mapping de l'entité Element
	 * @return String, Element
	 */

	@GetMapping("/getElements")
	public List<Element> getAllElements() {
		return elementService.getElements();
	}

	@GetMapping("/getElementId/{id}")
	public Optional<Element> getOneElement(@PathVariable Long id) {
		return elementService.getElement(id);
	}

	@GetMapping("/getElementNom/{nom}")
	public Optional<Element> getOneElementByNom(@PathVariable String nom) {
		return elementService.getElementByNom(nom);
	}

	@GetMapping("/getElementNomCourant/{nom}")
	public Optional<Element> getOneElementByNomCourant(@PathVariable String nom) {
		return elementService.getElementByNomCourant(nom);
	}

	/*@GetMapping("/getElementByFamille/{familleId}")
	public List<Element> getElementByFamille(@PathVariable Long familleId) {
		return elementService.getElementFamille(familleId);
	}*/

	@PostMapping("postElement")
	public String saveElement (@RequestBody Element element) {
		String nom = elementService.postElement(element).getNom();
		return "L'élément " + nom + " a bien été ajouté.";
	}

	@DeleteMapping("/deleteElement/{id}")
	public String deleteElement (@PathVariable Long id) {
		String nom = elementService.deleteElement(id);
		return "L'élément " + nom + " a bien été supprimé";
	}

	@PutMapping("/updateElement")
	public String updateElement (@RequestBody Element element) {
		String nom = elementService.updateElement(element).getNom();
		return "L'élément " + nom + " a bien été modifié";
	}

	/**
	 * Mapping de l'entité Mot
	 * @return Mot
	 */

	@GetMapping("/getRandomMot")
	public Optional<Mot> getOneRandomMot() {
		return motService.getRandomMot();
	}

	@GetMapping("/getOneMot/{mot}")
	public Optional<Mot> getMotByMot (@PathVariable String mot) {
		return motService.getMotByMot(mot);
	}

	/**
	 * Mapping de l'entité Jeu
	 * @return String
	 */

	@GetMapping("/getMots")
	public List<Jeu> getAllMot() {
		return jeuService.getMots();
	}

	@GetMapping("/getMotInJeu/{mot}")
	public Optional<Jeu> getOneMotInJeu (@PathVariable String mot) {
		return jeuService.getJeuByMot(mot);
	}

	@PostMapping("/postMot")
	public String saveMot (@RequestBody Jeu jeu) {
		return jeuService.postMot(jeu);
	}
}

