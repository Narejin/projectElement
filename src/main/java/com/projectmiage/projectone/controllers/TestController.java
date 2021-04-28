package com.projectmiage.projectone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * Donne une réponse "Services REST OK" si les services sont actifs.
     * @return string.
     */
    @GetMapping("/ok")
    public String getConfirm() {
        return "Services REST OK";
    }

}
