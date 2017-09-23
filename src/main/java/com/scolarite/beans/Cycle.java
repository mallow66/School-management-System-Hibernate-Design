package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Cycle {

    @Id
    @GeneratedValue
    private int idCycle;
    @Column
    private String designation;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_etablissement")
    private Etablissement etablissement;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "cycle")
    private Set<Niveau> niveaux;

    public Cycle(String designation, Etablissement etablissement, Set<Niveau> niveaux) {
        this.designation = designation;
        this.etablissement = etablissement;
        this.niveaux = niveaux;
    }

    public int getIdCycle() {
        return idCycle;
    }

    public String getDesignation() {
        return designation;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public Set<Niveau> getNiveaux() {
        return niveaux;
    }

    public void setIdCycle(int idCycle) {
        this.idCycle = idCycle;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public void setNiveaux(Set<Niveau> niveaux) {
        this.niveaux = niveaux;
    }
}
