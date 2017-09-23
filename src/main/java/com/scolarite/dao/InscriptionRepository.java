package com.scolarite.dao;

import com.scolarite.beans.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by brahim on 04/10/16.
 */
@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Integer>{

}
