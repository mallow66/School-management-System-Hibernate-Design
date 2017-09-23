package com.scolarite.services;

import com.scolarite.beans.Adulte;

import java.util.List;

/**
 * Created by brahim on 12/10/16.
 */
public interface AdulteService {

    public boolean exist(String cin);
    public Adulte getAdulte(String cin);
    public List<Adulte> getAdultes();
}
