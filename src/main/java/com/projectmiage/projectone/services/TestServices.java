package com.projectmiage.projectone.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServices {

    /**
     * Donne une réponse "Services REST OK" si les services sont actifs.
     * @return string.
     */
    @GetMapping("/ok")
    public String getConfirm() {
        return "Services REST OK";
    }

}
