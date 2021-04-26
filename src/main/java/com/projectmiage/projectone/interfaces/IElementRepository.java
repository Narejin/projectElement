package com.projectmiage.projectone.interfaces;

import java.util.Optional;

import com.projectmiage.projectone.entity.Element;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElementRepository extends JpaRepository<Element, Long> {

    public Optional<Element> findById(Long id);

}