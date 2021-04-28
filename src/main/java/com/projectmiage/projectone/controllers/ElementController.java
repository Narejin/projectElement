package com.projectmiage.projectone.controllers;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.ElementEntity;
import com.projectmiage.projectone.services.ElementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElementController {

    @Autowired
    ElementService elementService;

    /**
     * Extrait tous les éléments.
     * @return List<Element>.
     */
    @GetMapping("/getElements")
    public List<ElementEntity> getAllElements() {
        return this.elementService.getElements();
    }

    /**
     * Extrait un élement selon son Z.
     * @param id
     * @return Element.
     */
    @GetMapping("/getElement/{id}")
    public Optional<ElementEntity> getOneElement(@PathVariable Long id) {
        return this.elementService.getElement(id);
    }

    /**
     * Enregistre un élément.
     * @param elementEntity
     * @return String
     */
    @PostMapping(path = "/postElement", consumes = "application/json")
    public String postElement(@RequestBody ElementEntity elementEntity) {
        this.elementService.postElement(elementEntity);
        return "L'élément " + elementEntity.getNomCourant() + " à été ajouté";
    }

    /**
     * Modifie un élément.
     * @param elementEntity
     * @return String
     */
    @PutMapping(path = "/updateElement", consumes = "application/json")
    public String updateElement(@RequestBody ElementEntity elementEntity) {
        this.elementService.updateElement(elementEntity);
        return "L'élément à été modifié en " + elementEntity.getNomCourant();
    }

    /**
     * Supprime un élément.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteElement/{id}")
    public String deleteElement(@PathVariable Long id) {
        String nom = this.elementService.deleteElement(id);
        return "L'élément " + nom + " à été supprimé";
    }
}
