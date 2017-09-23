package com.scolarite.dao;

import com.scolarite.beans.AnneeScolaire;
import com.scolarite.beans.Eleve;
import com.scolarite.beans.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brahim on 04/10/16.
 */
@Repository
public class InscriptionDaoImpl implements InscriptionDao {
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    public void addInscription(Inscription inscription) {
        inscriptionRepository.save(inscription);
    }

    @Override
    public void removeInscription(Inscription inscription) {
        inscriptionRepository.delete(inscription);
    }

    @Override
    public boolean exist(Inscription inscription){
        List<Inscription> l = getAllInscriptions();
        for(Inscription i : l)
            if(i.equals(inscription))
                return true;
        return false;
    }

    @Override
    public Inscription getInscription(Eleve eleve, AnneeScolaire anneeScolaire) {

        List<Inscription> l = getAllInscriptions();
        for(Inscription i : l)
            if(i.getEleve().equals(eleve) && i.getAnneeScolaire().equals(anneeScolaire))
                return i;
        return null;
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }
}
