package com.scolarite.services;

import com.scolarite.beans.Eleve;

/**
 * Created by brahim on 03/10/16.
 */
public interface EleveService {

    public void addEleve(Eleve e);
    public void deleteEleve(Eleve e);
    public Eleve getEleve(String eleve);
    public boolean exist(String cne);
}
