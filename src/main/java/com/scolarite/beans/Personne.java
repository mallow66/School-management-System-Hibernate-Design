package com.scolarite.beans;

import javax.persistence.*;

/**
 * Created by brahim on 29/09/16.
 */

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)

public class Personne {
    @Id
    protected String cin;
    @Column
    protected String nom;

    @Column
    protected String motDePasse;

    @Column
    protected String prenom;
    @Column
    protected String email;
    @Column
    protected String telephone;
    @Column
    protected String age;


    public Personne(){

    }

    public Personne(String cin, String nom, String prenom, String email, String telephone, String age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAge() {
        return age;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
