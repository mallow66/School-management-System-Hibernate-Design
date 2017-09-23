package com.scolarite.beans;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Note {

    @Id
    @GeneratedValue
    private int idNote;
    @Column
    private Double noteCC;
    @Column
    private Double noteExamen;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_matiere")
    private Matiere matiere;
}
