package com.scolarite.services;

import com.scolarite.beans.Eleve;
import com.scolarite.dao.EleveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by brahim on 03/10/16.
 */
@Repository
public class EleveServiceImpl implements EleveService {

    @Autowired
    private EleveDao eleveDao;

    @Override
    public void addEleve(Eleve e) {
        eleveDao.addEleve(e);
    }

    @Override
    public void deleteEleve(Eleve e) {
        eleveDao.deleteEleve(e);
    }

    @Override
    public Eleve getEleve(String eleve) {
        return eleveDao.getEleve(eleve);
    }

    @Override
    public boolean exist(String cne){
        return eleveDao.exist(cne);
    }
}
