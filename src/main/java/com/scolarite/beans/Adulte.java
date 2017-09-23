package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
@PrimaryKeyJoinColumn(name = "id_adulte")
public class Adulte extends  Personne {

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "adulte")
    private Set<Paiement> paiements;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "adulte")
    private Set<Eleve> eleves;

    public Adulte() {
    }

    public Adulte(Set<Paiement> paiements, Set<Eleve> eleves) {
        this.paiements = paiements;
        this.eleves = eleves;
    }

    public Set<Paiement> getPaiements() {
        return paiements;
    }

    public Set<Eleve> getEleves() {
        return eleves;
    }

    public void setPaiements(Set<Paiement> paiements) {
        this.paiements = paiements;
    }

    public void setEleves(Set<Eleve> eleves) {
        this.eleves = eleves;
    }
}
