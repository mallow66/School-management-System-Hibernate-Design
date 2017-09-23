package com.scolarite.beans;

import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
public class Etablissement {

    @Id
    @GeneratedValue
    private int idEtablissement;
    @Column
    private String nomEtablissement;
    @Column
    private int capacite;
    @Column
    private int nbEleves;
}
