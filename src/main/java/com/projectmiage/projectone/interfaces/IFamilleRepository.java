package com.projectmiage.projectone.interfaces;

import java.util.Optional;

import com.projectmiage.projectone.entity.Famille;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFamilleRepository extends JpaRepository<Famille, Long> {

    public Optional<Famille> findById(Long id);

}