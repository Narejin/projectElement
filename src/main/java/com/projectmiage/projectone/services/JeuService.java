package com.projectmiage.projectone.services;

import com.projectmiage.projectone.entity.Jeu;
import com.projectmiage.projectone.interfaces.IJeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeuService {

    @Autowired
    IJeuRepository repository;

    public List<Jeu> getMots() {
        return repository.findAll();
    }

    public Jeu postMot(Jeu jeu) {
        return repository.save(jeu);
    }

}
