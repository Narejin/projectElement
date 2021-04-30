package com.projectmiage.projectone.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import com.projectmiage.projectone.entity.Element;
import org.springframework.stereotype.Repository;

@Repository
public interface IElementRepository extends JpaRepository<Element, Long> {
	
}