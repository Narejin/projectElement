package com.projectmiage.projectone.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectmiage.projectone.entity.Famille;

@Repository
public interface IFamilleRepository extends JpaRepository<Famille, Long> {
	
}