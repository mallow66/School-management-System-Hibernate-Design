package com.scolarite.dao;

import com.scolarite.beans.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by brahim on 01/10/16.
 */
@Repository
public interface EleveRepository extends JpaRepository<Eleve, String> {

    Eleve findByCne(String cne);

}
