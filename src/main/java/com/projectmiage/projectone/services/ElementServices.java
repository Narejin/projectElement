package com.projectmiage.projectone.services;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Element;
import com.projectmiage.projectone.repository.ElementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ElementServices {

    @Autowired
    ElementRepository elementRepository;

    /**
     * Extrait tous les éléments.
     * @return List<Element>.
     */
    @GetMapping("/getElements")
    public List<Element> getAllElements() {
        return this.elementRepository.getElements();
    }

    /**
     * Extrait un élement selon son Z.
     * @param id
     * @return Element.
     */
    @GetMapping("/getElement/{id}")
    public Optional<Element> getOneElement(@PathVariable Long id) {
        return this.elementRepository.getElement(id);
    }

    /**
     * Enregistre un élément.
     * @param element
     * @return String
     */
    @PostMapping(path = "/postElement", consumes = "application/json")
    public String postElement(@RequestBody Element element) {
        this.elementRepository.postElement(element);
        return "L'élément " + element.getNomCourant() + " à été ajouté";
    }

    /**
     * Modifie un élément.
     * @param element
     * @return String
     */
    @PutMapping(path = "/updateElement", consumes = "application/json")
    public String updateElement(@RequestBody Element element) {
        this.elementRepository.updateElement(element);
        return "L'élément à été modifié en " + element.getNomCourant();
    }

    /**
     * Supprime un élément.
     * @param id
     * @return String
     */
    @DeleteMapping(path = "/deleteElement/{id}")
    public String deleteElement(@PathVariable Long id) {
        String nom = this.elementRepository.deleteElement(id);
        return "L'élément " + nom + " à été supprimé";
    }
}
