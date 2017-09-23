package com.scolarite.beans;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Retard {

    @Id
    @GeneratedValue
    private int idRetard;
    @Column
    private int dureeRetard;
    @Column
    private String remarqueRetard;
    @Column
    private boolean justifiee;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_seance")
    private Seance seance;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;

}
