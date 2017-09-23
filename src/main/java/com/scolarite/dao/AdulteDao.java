package com.scolarite.dao;

import com.scolarite.beans.Adulte;

import java.util.List;

/**
 * Created by brahim on 12/10/16.
 */
public interface AdulteDao  {

    public boolean exist(String cin);
    public Adulte getAdulte(String cin);
    public List<Adulte> getAdultes();


}
