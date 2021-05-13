package com.projectmiage.projectone.controller;

import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.services.FamilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FamilleController {

    @Autowired
    FamilleService familleService;
    private Famille famille;

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
}
