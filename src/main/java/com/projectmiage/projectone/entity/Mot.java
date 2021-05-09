package com.projectmiage.projectone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mot")
public class Mot {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mot")
    private String mot;
    @Column (name = "elements")
    private String elements;

    public Mot(Long id, String mot, String elements) {
        this.id = id;
        this.mot = mot;
        this.elements = elements;
    }

    public Mot() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    /*@Override
    public String toString() {
        return "Mot{" +
                "id=" + id +
                ", mot='" + mot + '\'' +
                ", elements='" + elements + '\'' +
                '}';
    }*/
}
