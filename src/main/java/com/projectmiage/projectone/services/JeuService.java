package com.projectmiage.projectone.services;

import com.projectmiage.projectone.entity.Jeu;
import com.projectmiage.projectone.entity.Mot;
import com.projectmiage.projectone.interfaces.IJeuRepository;
import com.projectmiage.projectone.interfaces.IMotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JeuService {

    @Autowired
    IJeuRepository repository;
    @Autowired
    IMotRepository motRepository;
    @Autowired
    MotService motService;
    private Mot mot;

    public List<Jeu> getMots() {
        return repository.findAll();
    }

    public Optional<Jeu> getJeuByMot(String motTrouve) {
        return repository.findByMotTrouve(motTrouve);
    }

    public ArrayList<Jeu> getAllMotsByJoueur(String joueur) {
        return repository.findAllByJoueur(joueur);
    }

    public String postMot(Jeu jeu) {
        String motTrouve = jeu.getMotTrouve();
        if (motRepository.findByMot(motTrouve).isEmpty()) {
            return "Désolé ce mot n'existe pas dans la base de donnée";
        } else if (repository.findByJoueurAndMotTrouve(jeu.getJoueur(),jeu.getMotTrouve()).isPresent()) {
            return "Vous avez déjà trouvé le mot";
        }
        repository.save(jeu);
        return "Félicitation !!! Vous avez trouvé le mot " + motTrouve + " !!";
    }

    public String getMotGenere(String joueur) {
        Optional<Mot> motgenere = motService.getRandomMot();
        String anagramme = motgenere.get().getElements();
        if (repository.findByJoueurAndMotTrouve(joueur, motgenere.get().getMot()).isEmpty()) {
            return "Quel est le mot caché derrière ces éléments : " + anagramme + " ?";
        } else if (repository.findAllByJoueur(joueur).stream().count() == motRepository.count()) {
            return "Félicitation vous avez trouvé tous les mots cachés :)";
        }
        return getMotGenere(joueur);
    }
}
