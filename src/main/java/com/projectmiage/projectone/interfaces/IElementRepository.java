package com.projectmiage.projectone.interfaces;

import java.util.List;
import java.util.Optional;

import com.projectmiage.projectone.entities.ElementEntity;

import com.projectmiage.projectone.entities.FamilleEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IElementRepository extends JpaRepository<ElementEntity, Long> {

    Optional<ElementEntity> findById(Long id);

    List<ElementEntity> findByFamilleId(Long familleId);
}