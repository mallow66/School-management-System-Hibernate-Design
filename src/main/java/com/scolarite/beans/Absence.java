package com.scolarite.beans;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Absence {
    @Id
    @GeneratedValue
    private int idAbsence;
    @Column
    private Date dateAbsence;
    @Column
    private String remarqueAbsence;
    @Column
    private boolean justifiee;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_seance")
    private Seance seance;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name= "id_eleve")
    private Eleve eleve;

    public Absence(int idAbsence, Date dateAbsence, String remarqueAbsence, boolean justifiee, Seance seance, Eleve eleve) {
        this.idAbsence = idAbsence;
        this.dateAbsence = dateAbsence;
        this.remarqueAbsence = remarqueAbsence;
        this.justifiee = justifiee;
        this.seance = seance;
        this.eleve = eleve;
    }

    public Absence() {
    }

    public int getIdAbsence() {
        return idAbsence;
    }

    public Date getDateAbsence() {
        return dateAbsence;
    }

    public String getRemarqueAbsence() {
        return remarqueAbsence;
    }

    public boolean isJustifiee() {
        return justifiee;
    }

    public Seance getSeance() {
        return seance;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setIdAbsence(int idAbsence) {
        this.idAbsence = idAbsence;
    }

    public void setDateAbsence(Date dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public void setRemarqueAbsence(String remarqueAbsence) {
        this.remarqueAbsence = remarqueAbsence;
    }

    public void setJustifiee(boolean justifiee) {
        this.justifiee = justifiee;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }


}
