package com.waa.minieappbackend.repo;

import com.waa.minieappbackend.domain.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {

//    List<Product> find();

}
