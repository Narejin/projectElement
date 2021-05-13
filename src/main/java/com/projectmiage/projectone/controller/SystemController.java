package com.projectmiage.projectone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    /**
     * Mapping test OK
     * @return String
     */

    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return "Pour le moment, ça marche t'inquiète.";
    }
}
