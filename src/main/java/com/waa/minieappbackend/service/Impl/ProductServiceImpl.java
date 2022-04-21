package com.waa.minieappbackend.service.Impl;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.repo.ProductRepo;
import com.waa.minieappbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> findAll(){
        return productRepo.findAll();
    }

    @Override
    public List<Product> findAllById(long id){
        return productRepo.findAllById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public void save(Product p){
        productRepo.save(p);
    }

    @Override
    public void updateById(Long id, Product p){
        if(p != null){
            p.setId(id);
            productRepo.save(p);
        }
    }

    @Override
    public List<Product> findProductByTitle(String title) {
        return productRepo.findProductByTitle(title);
    }

}
