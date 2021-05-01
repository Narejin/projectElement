package com.projectmiage.projectone.controllers;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.FamilleEntity;
import com.projectmiage.projectone.services.FamilleService;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FamilleController {

    @Autowired
    FamilleService familleService;

    /**
     * Extrait toutes les familles des éléments.
     * @return List<FamilleEntity>.
     */
    @GetMapping("/getFamilles")
    public ResponseEntity<List<FamilleEntity>> getAllFamilles() {
        return new ResponseEntity<>(this.familleService.getFamilles(), HttpStatus.OK);
    }

    /**
     * Extrait une famille selon l'identifiant.
     * @param id
     * @return FamilleEntity.
     */
    @GetMapping("/getFamille/{id}")
    public ResponseEntity<Optional<FamilleEntity>> getOneFamille(@PathVariable Long id) {
        return new ResponseEntity<>(this.familleService.getFamille(id), HttpStatus.OK);
    }

    /**
     * Enregistre une famille.
     * @param familleEntity
     * @return String
     */
    @PostMapping(path = "/postFamille", consumes = "application/json")
    public ResponseEntity<String> postFamille(@RequestBody FamilleEntity familleEntity) {
        this.familleService.postFamille(familleEntity);
        return new ResponseEntity<>("La famille " + familleEntity.getNom() + " à été ajoutée", HttpStatus.CREATED);
    }

    /**
     * Modifie une famille.
     * @param familleEntity
     * @return String
     */
    @PutMapping(path = "/updateFamille", consumes = "application/json")
    public ResponseEntity<String> updateFamille(@RequestBody FamilleEntity familleEntity) {
        this.familleService.updateFamille(familleEntity);
        return new ResponseEntity<>("La famille à été modifié en " + familleEntity.getNom(), HttpStatus.OK);
    }
    /**
     * Modifie partiellement une famille.
     * @param familleEntity
     * @return String
     */
    @PatchMapping(path = "/updateParticularite", consumes = "application/json")
    public ResponseEntity<String> updateParticulariteFamille(@RequestBody FamilleEntity familleEntity) {
        this.familleService.updateParticulariteFamille(familleEntity);
        return new ResponseEntity<>("La particularité de la famille " + familleEntity.getNom() + " est désormais : " + familleEntity.getParticularite(), HttpStatus.OK);
    }

    /**
     * Supprime une famille.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteFamille/{id}")
    public ResponseEntity<String> deleteFamille(@PathVariable Long id) {
        String nom = this.familleService.deleteFamille(id);
        return new ResponseEntity<>("La famille " + nom + " à été supprimée", HttpStatus.OK);
    }
}
