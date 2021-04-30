package com.projectmiage.projectone.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectmiage.projectone.entity.Famille;

import java.util.Optional;

@Repository
public interface IFamilleRepository extends JpaRepository<Famille, Long> {

    Optional<Famille> findByNom(String nom);
    Optional<Famille> findById(Long id);
}