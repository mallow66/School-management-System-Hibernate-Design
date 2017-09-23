package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
@PrimaryKeyJoinColumn(name="id_fonctionnaire")
public class Fonctionnaire extends Adulte {

    @Column
    private Double salaire;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "fonctionnaire_matiere", joinColumns = {
            @JoinColumn(name = "id_fonctionnaire", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id_matiere",
                    nullable = false, updatable = false) })
    private Set<Matiere> matieres;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fonctionnaire")
    private Set<Reservation> reservations;


    public Fonctionnaire(){

    }

    public Fonctionnaire(Double salaire, Set<Matiere> matieres, Set<Reservation> reservations) {
        this.salaire = salaire;
        this.matieres = matieres;
        this.reservations = reservations;
    }

    public Fonctionnaire(Set<Paiement> paiements, Set<Eleve> eleves, Double salaire, Set<Matiere> matieres, Set<Reservation> reservations) {
        super(paiements, eleves);
        this.salaire = salaire;
        this.matieres = matieres;
        this.reservations = reservations;
    }



    public Double getSalaire() {
        return salaire;
    }

    public Set<Matiere> getMatieres() {
        return matieres;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public void setMatieres(Set<Matiere> matieres) {
        this.matieres = matieres;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
