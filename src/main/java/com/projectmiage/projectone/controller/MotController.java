package com.projectmiage.projectone.controller;

import com.projectmiage.projectone.entity.Mot;
import com.projectmiage.projectone.services.MotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MotController {

    @Autowired
    MotService motService;
    private Mot mot;

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
}
