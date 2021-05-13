package com.projectmiage.projectone.controller;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.services.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ElementController {

    @Autowired
    ElementService elementService;
    private Element element;

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
}
