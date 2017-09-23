package com.scolarite.services;

import com.scolarite.beans.Inscription;
import com.scolarite.dao.InscriptionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by brahim on 04/10/16.
 */
@Repository
public class InscriptionServiceImpl implements InscriptionService {

    @Autowired
    private InscriptionDao inscriptionDao;
    @Override
    public void addInscription(Inscription inscription) {
        inscriptionDao.addInscription(inscription);

    }
}
