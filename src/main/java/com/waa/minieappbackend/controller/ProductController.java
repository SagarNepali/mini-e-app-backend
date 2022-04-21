package com.waa.minieappbackend.controller;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Product> allProductsV1(){
        return productService.findAll();
    }


    @GetMapping(value = "/{id}")
    public List<Product> getProductById(@PathVariable("id") Long id){
        return productService.findAllById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void newPost(@RequestBody Product newProduct){
        productService.save(newProduct);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePost(@PathVariable Long id, @RequestBody Product product){
        productService.updateById(id, product);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);
    }

}
