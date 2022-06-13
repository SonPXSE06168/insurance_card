package com.swp.insurancecard.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurances")
@Data
public class Insurance {
    @Id
    Integer id;
    String name;
    String target;
    String shortDetail;
    String scope;
    String img;
}
