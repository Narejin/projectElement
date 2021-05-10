package com.projectmiage.projectone.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "jeu")
public class Jeu {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name ="joueur")
    private String joueur;
    @Column(name ="mot_trouve")
    private String motTrouve;
    @Column(name = "date")
    private Date date;

    public Jeu(long id, String joueur, String motTrouve, Date date) {
        this.id = id;
        this.joueur = joueur;
        this.motTrouve = motTrouve;
        this.date = date;
    }

    public Jeu() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
    }

    public String getMotTrouve() {
        return motTrouve;
    }

    public void setMotTrouve(String motTrouve) {
        this.motTrouve = motTrouve;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /*@Override
    public String toString() {
        return "Jeu{" +
                "id=" + id +
                ", joueur='" + joueur + '\'' +
                ", motTrouve='" + motTrouve + '\'' +
                ", date=" + date +
                '}';
    }*/
}
