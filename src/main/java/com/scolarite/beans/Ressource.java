package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 01/10/16.
 */
@Table
@Entity

public class Ressource {
    @Id
    @GeneratedValue
    private int idRessource;
    @Column
    private String designation;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ressources")
    private Set<Reservation> reservations;

}
