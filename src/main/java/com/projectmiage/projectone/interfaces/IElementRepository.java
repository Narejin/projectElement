package com.projectmiage.projectone.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import com.projectmiage.projectone.entity.Element;

public interface IElementRepository extends JpaRepository<Element, Long> {
	
}