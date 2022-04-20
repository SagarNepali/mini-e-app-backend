package com.waa.minieappbackend.controller;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Product> allProductsDefault(){ // default -> redirect to V1 ( empty header )
        return allProductsV1();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping( headers = "X-API-VERSION=1")
    public List<Product> allProductsV1(){
        return productService.findAll();
    }

//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping( headers = "X-API-VERSION=2")       // versioning has changed to uri
//    public List<ProductDto> allProductsV2(){
//        return postService.findAllDto();
//    }

    @GetMapping(value = "/{id}")
    public List<Product> getProductById(@PathVariable("id") Long id){
        return productService.findAllById(id);
    }

//    @GetMapping( value = "/{id}", headers = "X-API-VERSION=2")
//    public PostDto getPostByIdDto(@PathVariable("id") Long id){
//        return postService.findByIdDto(id);
//    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "")
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

//    @GetMapping("/filter")
//    public List<PostDto> filtered(@RequestParam String author){
//        return postService.filterByAuthor(author);
//    }

}
