package com.projectmiage.projectone.controller;

import com.projectmiage.projectone.entity.Jeu;
import com.projectmiage.projectone.services.JeuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JeuController {

    @Autowired
    JeuService jeuService;
    private Jeu jeu;

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
