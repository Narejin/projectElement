package com.projectmiage.projectone.interfaces;

import com.projectmiage.projectone.entity.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface IJeuRepository extends JpaRepository<Jeu, Long> {

    Optional<Jeu> findByMotTrouve(String motTrouve);
    Optional<Jeu> findByJoueurAndMotTrouve(String joueur, String motTrouve);
    ArrayList<Jeu> findAllByJoueur(String joueur);
}
