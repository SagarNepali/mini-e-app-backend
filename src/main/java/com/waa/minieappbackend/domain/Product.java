package com.waa.minieappbackend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private float price;
    private String description;
    private String category;
    private String image;

    @OneToOne

    private Rating rating;


}
//    @ManyToOne()
//    @JoinColumn()
//    @JsonBackReference()
//    private Users user;
//
//    @OneToMany( mappedBy = "product", cascade = CascadeType.ALL )
//    @JsonManagedReference
//    private List<Rating> ratings;
/**
 * {
 *       id: 1,
 *       title: "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
 *       price: 109.95,
 *       description:
 *         "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
 *       category: "men's clothing",
 *       image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
 *       rating: {
 *         rate: 3.9,
 *         count: 120,
 *       },
 *     },
 */