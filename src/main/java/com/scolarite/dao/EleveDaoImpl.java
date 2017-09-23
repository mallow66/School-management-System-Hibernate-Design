package com.scolarite.dao;

import com.scolarite.beans.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by brahim on 01/10/16.
 */
@Repository
public class EleveDaoImpl implements EleveDao {
    @Autowired
    private EleveRepository eleveRepository;

    @Override
    public void addEleve(Eleve e) {
        eleveRepository.save(e);

    }

    @Override
    public void deleteEleve(Eleve e) {
        eleveRepository.delete(e);
    }

    @Override
    public Eleve getEleve(String cne) {
        return eleveRepository.findByCne(cne);
    }

    @Override
    public boolean exist(String cne){
        Eleve e = eleveRepository.findByCne(cne);
        if(e != null)
            return true;
        return false;
    }
}
