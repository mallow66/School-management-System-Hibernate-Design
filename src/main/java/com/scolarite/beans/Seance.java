package com.scolarite.beans;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Seance {

    @Id
    @GeneratedValue
    private int idSeance;
    @Column
    private String designation;
    @Column
    private String debut;
    @Column
    private int duree; //la duree en minute;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "seances")
    private Set<Eleve> eleves;
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "seance")
    private Set<Absence> absences;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "seance")
    private Set<Retard> retards;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "seance")
    private Set<Sanction> sanctions;






}
