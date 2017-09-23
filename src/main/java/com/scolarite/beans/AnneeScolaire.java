package com.scolarite.beans;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class AnneeScolaire {
    @EmbeddedId
    private DebutFin idAnneScolaire;
    @Column
    private String designation;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "anneeScolaire")
    private Set<Inscription> inscriptions;

    public AnneeScolaire(DebutFin idAnneScolaire, String designation, Set<Inscription> inscriptions) {
        this.idAnneScolaire = idAnneScolaire;
        this.designation = designation;
        this.inscriptions = inscriptions;
    }

    public AnneeScolaire(){

    }

    public DebutFin getIdAnneScolaire() {
        return idAnneScolaire;
    }

    public String getDesignation() {
        return designation;
    }

    public Set<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setIdAnneScolaire(DebutFin idAnneScolaire) {
        this.idAnneScolaire = idAnneScolaire;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setInscriptions(Set<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @Override
    public boolean equals(Object o){
        if(this == o ) return true;
        if(o == null || o.getClass()!= this.getClass() ) return false;

        AnneeScolaire that = (AnneeScolaire)o;
        if(that.getIdAnneScolaire().equals(idAnneScolaire)) return true;
        return false;
    }
}
