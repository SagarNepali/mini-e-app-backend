package com.waa.minieappbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date date;

    @OneToOne
    private ShippingAddress shippingAddress;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;

    // payment method ?

    // delivery ?

}
