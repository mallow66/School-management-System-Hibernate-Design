package com.scolarite.beans;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by brahim on 29/09/16.
 */

@Entity
@Table(uniqueConstraints=
@UniqueConstraint(columnNames = {"debutAnneeScolaire", "finAnneeScolaire"}))
public class Inscription {

    @Id
    @GeneratedValue
    private int  idInscription;
    @Column
    private Date dateInscription;
    @Column
    private Double montantScolarite;
    @Column
    private Double montantVerse;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "debutAnneeScolaire", referencedColumnName = "debutAnneeScolaire"),
            @JoinColumn(name = "finAnneeScolaire", referencedColumnName = "finAnneScolaire")
    })
    private AnneeScolaire anneeScolaire;


    public int  getIdInscription() {
        return idInscription;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public Double getMontantScolarite() {
        return montantScolarite;
    }

    public Double getMontantVerse() {
        return montantVerse;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public AnneeScolaire getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public void setMontantScolarite(Double montantScolarite) {
        this.montantScolarite = montantScolarite;
    }

    public void setMontantVerse(Double montantVerse) {
        this.montantVerse = montantVerse;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public void setAnneeScolaire(AnneeScolaire anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inscription that = (Inscription) o;

        if(that.getEleve().equals(eleve) && that.getAnneeScolaire().equals(anneeScolaire))
            return true;

        return false;
    }


}
