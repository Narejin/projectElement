package com.projectmiage.projectone.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectmiage.projectone.entity.Element;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IElementRepository extends JpaRepository<Element, Long> {

    Optional<Element> findByNom(String nom);
    Optional<Element> findById(Long id);
    Optional<Element> findByNomCourant(String nom);
    /*List<Element> findByFamilleId(Long familleId);*/
}