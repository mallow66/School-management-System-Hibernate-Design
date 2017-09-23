package com.scolarite.beans;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Paiement {

    @Id
    @GeneratedValue
    private int idPaiement;
    @Column
    private Double montant;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_adulte")
    private  Adulte adulte;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_mois")
    private Mois mois;
}
