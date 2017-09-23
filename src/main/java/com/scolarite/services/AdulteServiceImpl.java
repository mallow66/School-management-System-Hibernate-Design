package com.scolarite.services;

import com.scolarite.beans.Adulte;
import com.scolarite.dao.AdulteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brahim on 12/10/16.
 */

@Repository
public class AdulteServiceImpl implements  AdulteService{

    @Autowired
    AdulteDao adulteDao;

    @Override
    public boolean exist(String cin) {
        return adulteDao.exist(cin);
    }

    @Override
    public Adulte getAdulte(String cin) {
        return adulteDao.getAdulte(cin);
    }

    @Override
    public List<Adulte> getAdultes() {
        return adulteDao.getAdultes();
    }
}
