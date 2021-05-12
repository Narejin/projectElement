package com.projectmiage.projectone.services;


import com.projectmiage.projectone.entity.Mot;
import com.projectmiage.projectone.interfaces.IMotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class MotService {

    @Autowired
    IMotRepository repository;

    public Optional<Mot> getRandomMot() {
        Random random = new Random();
        int nb = 1 +random.nextInt((int) (repository.count()));
        return repository.findById((long) nb);

    }

    public Optional<Mot> getMotByMot(String mot) {
        return repository.findByMot(mot);
    }
}
