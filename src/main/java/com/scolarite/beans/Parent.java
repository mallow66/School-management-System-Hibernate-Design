package com.scolarite.beans;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
@PrimaryKeyJoinColumn(name="id_parent")
public class Parent extends Adulte {

}
