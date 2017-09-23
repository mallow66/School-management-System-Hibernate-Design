package com.scolarite.beans;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by brahim on 29/09/16.
 */
@Entity
@Table
public class Filiere {
    @Id
    @GeneratedValue
    private int idFiliere;
    @Column
    private String designation;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "filiere")
    private Set<Classe> classe;


}
