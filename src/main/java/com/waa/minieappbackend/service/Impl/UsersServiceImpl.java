package com.waa.minieappbackend.service.Impl;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.domain.Users;
import com.waa.minieappbackend.repo.ProductRepo;
import com.waa.minieappbackend.repo.UsersRepo;
import com.waa.minieappbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepo usersRepo;

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Users> findAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public Users findUserById(Long id) {
        return usersRepo.findById(id).orElse(null);
    }

    @Override
    public void createUser(Users newUser) {
        usersRepo.save(newUser);
    }

    @Override
    public List<Product> findAllProducts(Long id) {
        return postRepo.findAllById(id).orElse(null);
    }

//    @Override
//    public void addProductToUser(Long id, Product p) {
//        if(findUserById(id) != null) {
//            Users user = findUserById(id);
//            user.setProducts();
////            save(user);
//        }
//    }

    @Override
    public void deleteById(Long id){
        usersRepo.deleteById(id);
    }

//    @Override
//    public List<Users> usersWithAPostTitled(String title){
//        return usersRepo.findUsersByPostTitle(title);
//    }

    @Override
    public Users findUserByEmail(String username) {
        return usersRepo.findUsersByUsername(username);
    }

}
