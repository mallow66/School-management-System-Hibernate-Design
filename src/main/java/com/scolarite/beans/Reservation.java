package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 01/10/16.
 */
@Entity
@Table
public class Reservation {

    @Id
    @GeneratedValue
    private int idReservation;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "reservation_ressource", joinColumns = {
            @JoinColumn(name = "id_reservation", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id_ressource",
                    nullable = false, updatable = false) })
    private Set<Ressource> ressources;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_fonctionnaire")
    private Fonctionnaire fonctionnaire;

}
