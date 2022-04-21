package com.waa.minieappbackend.repo;

import com.waa.minieappbackend.domain.Cart;
import com.waa.minieappbackend.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepo extends CrudRepository<Cart, Long> {

    List<Product> find();

}
