package com.scolarite.beans;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
@PrimaryKeyJoinColumn(name = "enseignant")
public class Enseignant extends Fonctionnaire {


}
