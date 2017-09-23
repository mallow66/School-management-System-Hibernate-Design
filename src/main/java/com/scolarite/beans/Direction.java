package com.scolarite.beans;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by brahim on 29/09/16.
 */
@Table
@Entity
@PrimaryKeyJoinColumn(name = "id_direction")
public class Direction extends Adulte {

}
