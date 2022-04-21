package com.waa.minieappbackend.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    // buyer, Seller, Admin
    // This should be converted an Enum
    private String role;
}
