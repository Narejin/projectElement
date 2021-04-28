package com.projectmiage.projectone.controllers;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.FamilleEntity;
import com.projectmiage.projectone.services.FamilleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FamilleController {

    @Autowired
    FamilleService familleService;

    /**
     * Extrait toutes les familles des éléments.
     * @return List<Famille>.
     */
    @GetMapping("/getFamilles")
    public List<FamilleEntity> getAllFamilles() {
        return this.familleService.getFamilles();
    }

    /**
     * Extrait une famille selon l'identifiant.
     * @param id
     * @return Famille.
     */
    @GetMapping("/getFamille/{id}")
    public Optional<FamilleEntity> getOneFamille(@PathVariable Long id) {
        return this.familleService.getFamille(id);
    }

    /**
     * Enregistre une famille.
     * @param familleEntity
     * @return String
     */
    @PostMapping(path = "/postFamille", consumes = "application/json")
    public String postFamille(@RequestBody FamilleEntity familleEntity) {
        this.familleService.postFamille(familleEntity);
        return "La famille " + familleEntity.getNom() + " à été ajoutée";
    }

    /**
     * Modifie une famille.
     * @param familleEntity
     * @return String
     */
    @PutMapping(path = "/updateFamille", consumes = "application/json")
    public String updateFamille(@RequestBody FamilleEntity familleEntity) {
        this.familleService.updateFamille(familleEntity);
        return "La famille à été modifié en " + familleEntity.getNom();
    }

    /**
     * Supprime une famille.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteFamille/{id}")
    public String deleteFamille(@PathVariable Long id) {
        String nom = this.familleService.deleteFamille(id);
        return "La famille " + nom + " à été supprimée";
    }
}
