package com.projectmiage.projectone.interfaces;

import com.projectmiage.projectone.entity.Mot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMotRepository extends JpaRepository<Mot, Long> {

    Optional<Mot> findById(Long id);

}
