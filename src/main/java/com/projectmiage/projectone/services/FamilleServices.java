package com.projectmiage.projectone.services;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.repository.FamilleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FamilleServices {

    @Autowired
    FamilleRepository familleRepository;

    /**
     * Extrait toutes les familles des éléments.
     * @return List<Famille>.
     */
    @GetMapping("/getFamilles")
    public List<Famille> getAllFamilles() {
        return this.familleRepository.getFamilles();
    }

    /**
     * Extrait une famille selon l'identifiant.
     * @param id
     * @return Famille.
     */
    @GetMapping("/getFamille/{id}")
    public Optional<Famille> getOneFamille(@PathVariable Long id) {
        return this.familleRepository.getFamille(id);
    }

    /**
     * Enregistre une famille.
     * @param famille
     * @return String
     */
    @PostMapping(path = "/postFamille", consumes = "application/json")
        public String postFamille(@RequestBody Famille famille) {
            Famille tartampion = this.familleRepository.postFamille(famille);
            if(tartampion == null) {
                return "La famille " + famille.getNom() + " existe déjà et n'a pas été ajoutée.";
            }
            return "La famille " + famille.getNom() + " à été ajoutée.";
    }

    /**
     * Modifie une famille.
     * @param famille
     * @return String
     */
    @PutMapping(path = "/updateFamille", consumes = "application/json")
    public String updateFamille(@RequestBody Famille famille) {
        this.familleRepository.updateFamille(famille);
        return "La famille à été modifié en " + famille.getNom();
    }

    /**
     * Supprime une famille.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteFamille/{id}")
    public String deleteFamille(@PathVariable Long id) {
        String nom = this.familleRepository.deleteFamille(id);
        return "La famille " + nom + " à été supprimée";
    }
}
