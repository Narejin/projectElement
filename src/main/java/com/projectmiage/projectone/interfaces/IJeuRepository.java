package com.projectmiage.projectone.interfaces;

import com.projectmiage.projectone.entity.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJeuRepository extends JpaRepository<Jeu, Long> {

}
