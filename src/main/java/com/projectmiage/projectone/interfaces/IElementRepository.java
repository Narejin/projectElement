package com.projectmiage.projectone.interfaces;

import java.util.Optional;

import com.projectmiage.projectone.entities.ElementEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElementRepository extends JpaRepository<ElementEntity, Long> {

    Optional<ElementEntity> findById(Long id);

}