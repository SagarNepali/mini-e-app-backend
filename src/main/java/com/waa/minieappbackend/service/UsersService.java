package com.waa.minieappbackend.service;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.domain.Users;
import com.waa.minieappbackend.domain.dto.UsersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    List<Users> findAllUsers();

    List<UsersDto> findAllDto();

    Users findUserById(Long id);

    void createUser(Users newUser);

    List<Product> findAllProducts(Long id);

//    void addProductToUser(Long id, Product p);

    void deleteById(Long id);

    Users findUserByEmail(String email);

    UsersDto findUserByEmailDto(String email);
}
