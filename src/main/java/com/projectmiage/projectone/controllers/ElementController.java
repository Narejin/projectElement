package com.projectmiage.projectone.controllers;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.ElementEntity;
import com.projectmiage.projectone.services.ElementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElementController {

    @Autowired
    ElementService elementService;

    /**
     * Extrait tous les éléments.
     * @return List<ElementEntity>.
     */
    @GetMapping("/getElements")
    public ResponseEntity<List<ElementEntity>> getAllElements() {
        return new ResponseEntity<>(this.elementService.getElements(), HttpStatus.OK);
    }

    /**
     * Extrait tous les éléments selon la famille.
     * @return List<ElementEntity>.
     */
    @GetMapping("/getElements/{familleId}")
    public ResponseEntity<List<ElementEntity>> getElementsByFamilleId(@PathVariable Long familleId) {
        return new ResponseEntity<>(this.elementService.getElementsByFamilleId(familleId), HttpStatus.OK);
    }

    /**
     * Extrait un élement selon son Z.
     * @param id
     * @return ElementEntity.
     */
    @GetMapping("/getElement/{id}")
    public ResponseEntity<Optional<ElementEntity>> getOneElement(@PathVariable Long id) {
        return new ResponseEntity<>(this.elementService.getElement(id), HttpStatus.OK);
    }

    /**
     * Enregistre un élément.
     * @param elementEntity
     * @return String
     */
    @PostMapping(path = "/postElement", consumes = "application/json")
    public ResponseEntity<String> postElement(@RequestBody ElementEntity elementEntity) {
        this.elementService.postElement(elementEntity);
        return new ResponseEntity<>("L'élément " + elementEntity.getNomCourant() + " à été ajouté", HttpStatus.CREATED);
    }

    /**
     * Modifie un élément.
     * @param elementEntity
     * @return String
     */
    @PutMapping(path = "/updateElement", consumes = "application/json")
    public ResponseEntity<String> updateElement(@RequestBody ElementEntity elementEntity) {
        this.elementService.updateElement(elementEntity);
        return new ResponseEntity<>("L'élément à été modifié en " + elementEntity.getNomCourant(), HttpStatus.OK);
    }

    /**
     * Supprime un élément.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteElement/{id}")
    public ResponseEntity<String> deleteElement(@PathVariable Long id) {
        String nom = this.elementService.deleteElement(id);
        return new ResponseEntity<>("L'élément " + nom + " à été supprimé", HttpStatus.OK);
    }
}
