package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Mois {
    @Id
    @GeneratedValue
    private int idMois;
    @Column
    private String designation;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "mois")
    private Set<Paiement> paiements;
}
