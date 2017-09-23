package com.scolarite.dao;

import com.scolarite.beans.Adulte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brahim on 12/10/16.
 */
@Repository
public class AdulteDaoImp implements AdulteDao {

    @Autowired
    private AdulteRepository adulteRepository;

    @Override
    public boolean exist(String cin) {
        Adulte a = adulteRepository.findByCin(cin);
        if(a!= null)
            return true;
        return false;
    }

    @Override
    public Adulte getAdulte(String cin) {
        return adulteRepository.findByCin(cin);
    }

    @Override
    public List<Adulte> getAdultes(){

        return adulteRepository.findAllByOrderByNom();
    }
}
