package com.scolarite.dao;

import com.scolarite.beans.Adulte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brahim on 12/10/16.
 */
@Repository
public interface AdulteRepository extends JpaRepository<Adulte, String> {

    public Adulte findByCin(String cin);
    public List<Adulte> findAllByOrderByNom();

}
