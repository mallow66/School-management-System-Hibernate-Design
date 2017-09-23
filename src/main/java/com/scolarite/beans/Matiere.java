package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Matiere {

    @Id
    @GeneratedValue
    private int idMatiere;
    @Column
    private String designation;
    @Column
    private Double coefficient;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "matiere")
    private Set<Note> notes;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "matieres")
    private Set<Fonctionnaire> fonctionnaires;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "matiere")
    private Set<Seance> seances;
}
