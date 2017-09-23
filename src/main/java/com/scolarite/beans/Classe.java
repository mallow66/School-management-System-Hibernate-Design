package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Classe {
    @Id
    @GeneratedValue

    private int idClasse;
    @Column
    private int capacite;
    @Column
    private int nbreEleves;
    @Column
    private int designation;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="filiere")
    private Filiere filiere;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="niveau")
    private Niveau niveau;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "classe")
    private Set<Eleve> eleves;

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNbreEleves() {
        return nbreEleves;
    }

    public void setNbreEleves(int nbreEleves) {
        this.nbreEleves = nbreEleves;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Set<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(Set<Eleve> eleves) {
        this.eleves = eleves;
    }
}
