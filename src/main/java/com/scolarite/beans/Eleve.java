package com.scolarite.beans;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
@PrimaryKeyJoinColumn(name="id_eleve")
public class Eleve extends Personne {

    @Column
    private String cne;
    @Column
    private boolean redoublant;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_adulte")
    private Adulte adulte;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "eleve_seance", joinColumns = {
            @JoinColumn(name = "id_eleve", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id_seance",
                    nullable = false, updatable = false) })
    private Set<Seance> seances;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "eleve")
    private Set<Absence> absences;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "eleve")
    private Set<Retard> retards;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "eleve")
    private Set<Sanction> sanctions;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_classe")
    private Classe classe;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "eleve")
    private Set<Note> notes;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "eleve")
    private Set<Inscription> inscriptions;

    public Eleve() {

    }

    public Eleve(String cne, boolean redoublant, Adulte adulte, Set<Seance> seances, Set<Absence> absences, Set<Retard> retards, Set<Sanction> sanctions, Classe classe, Set<Note> notes, Set<Inscription> inscriptions) {
        this.cne = cne;
        this.redoublant = redoublant;
        this.adulte = adulte;
        this.seances = seances;
        this.absences = absences;
        this.retards = retards;
        this.sanctions = sanctions;
        this.classe = classe;
        this.notes = notes;
        this.inscriptions = inscriptions;
    }


    public String getCne() {
        return cne;
    }

    public boolean isRedoublant() {
        return redoublant;
    }

    public Adulte getAdulte() {
        return adulte;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public Set<Absence> getAbsences() {
        return absences;
    }

    public Set<Retard> getRetards() {
        return retards;
    }

    public Set<Sanction> getSanctions() {
        return sanctions;
    }

    public Classe getClasse() {
        return classe;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public Set<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setRedoublant(boolean redoublant) {
        this.redoublant = redoublant;
    }

    public void setAdulte(Adulte adulte) {
        this.adulte = adulte;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public void setAbsences(Set<Absence> absences) {
        this.absences = absences;
    }

    public void setRetards(Set<Retard> retards) {
        this.retards = retards;
    }

    public void setSanctions(Set<Sanction> sanctions) {
        this.sanctions = sanctions;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public void setInscriptions(Set<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }
}
