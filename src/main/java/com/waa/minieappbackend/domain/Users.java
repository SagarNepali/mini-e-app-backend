package com.waa.minieappbackend.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String username;
    private String password;
    private String firstName;
    private String lastName;


    // cart, could be normalized to be just
    // Cart here, and the details could go inside that object.
    // but this is not Amazon
    // @OneToMany( mappedBy = "user", cascade = CascadeType.ALL )
    @OneToMany()
    private List<Product> products;

    @ManyToMany
    @JoinTable
    private List<Role> roles;

}
