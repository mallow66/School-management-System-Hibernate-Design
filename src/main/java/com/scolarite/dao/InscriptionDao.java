package com.scolarite.dao;

import com.scolarite.beans.AnneeScolaire;
import com.scolarite.beans.Eleve;
import com.scolarite.beans.Inscription;

import java.util.List;

/**
 * Created by brahim on 04/10/16.
 */
public interface InscriptionDao {
    public void addInscription(Inscription inscription);
    public void removeInscription(Inscription inscription);
    public boolean exist(Inscription inscription);
    public Inscription getInscription(Eleve e, AnneeScolaire anneeScolaire);
    public List<Inscription> getAllInscriptions();

}
