package com.waa.minieappbackend.repo;

import com.waa.minieappbackend.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Optional<List<Product>> findAllById(Long id);

    void deleteById(Long id);

    @Query("select p from Product p where p.title = :title")
    List<Product> findProductByTitle(String title);
    
}

