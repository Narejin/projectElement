package com.projectmiage.projectone.interfaces;

import java.util.Optional;

import com.projectmiage.projectone.entities.FamilleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFamilleRepository extends JpaRepository<FamilleEntity, Long> {

    Optional<FamilleEntity> findById(Long id);

}