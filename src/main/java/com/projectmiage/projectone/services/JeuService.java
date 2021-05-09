package com.projectmiage.projectone.services;

import com.projectmiage.projectone.interfaces.IJeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JeuService {

    @Autowired
    IJeuRepository repository;

}
