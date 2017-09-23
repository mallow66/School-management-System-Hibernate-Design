package com.scolarite.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by brahim on 04/10/16.
 */
@Embeddable
public class DebutFin implements Serializable{

    @Column
    private int debutAnneeScolaire;
    @Column
    private int finAnneScolaire;

    public DebutFin(int debutAnneeScolaire, int finAnneScolaire) {
        this.debutAnneeScolaire = debutAnneeScolaire;
        this.finAnneScolaire = finAnneScolaire;
    }
    public DebutFin(){

    }

    public int getDebutAnneeScolaire() {
        return debutAnneeScolaire;
    }

    public int getFinAnneScolaire() {
        return finAnneScolaire;
    }

    public void setDebutAnneeScolaire(int debutAnneeScolaire) {
        this.debutAnneeScolaire = debutAnneeScolaire;
    }

    public void setFinAnneScolaire(int finAnneScolaire) {
        this.finAnneScolaire = finAnneScolaire;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj.getClass() != this.getClass())
            return false;
        DebutFin other = (DebutFin)obj;
        if(other.getDebutAnneeScolaire() == this.getDebutAnneeScolaire() && other.getFinAnneScolaire() == this.getFinAnneScolaire())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        String hash = ""+debutAnneeScolaire +""+finAnneScolaire;
        return Integer.parseInt(hash);
    }
}
