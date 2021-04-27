package com.projectmiage.projectone.interfaces;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entity.Famille;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFamilleRepository extends JpaRepository<Famille, Long> {

    Optional<Famille> findById(Long id);

    Optional<Famille> findByNom(String nom);
}