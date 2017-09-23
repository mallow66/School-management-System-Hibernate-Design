package com.scolarite.beans;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Sanction {

    @Id
    @GeneratedValue
    private int idSanction;
    @Column
    private String objetSanction;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_seance")
    private Seance seance;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;


}
