package com.scolarite.dao;

import com.scolarite.beans.Eleve;

import java.util.List;

/**
 * Created by brahim on 01/10/16.
 */
public interface EleveDao {

    public void addEleve(Eleve e);
    public void deleteEleve(Eleve e);
    public Eleve getEleve(String cne);
    public boolean exist(String cne);

}
