package com.waa.minieappbackend.service.Impl;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.domain.Users;
import com.waa.minieappbackend.domain.dto.ProductDto;
import com.waa.minieappbackend.domain.dto.UsersDto;
import com.waa.minieappbackend.repo.ProductRepo;
import com.waa.minieappbackend.repo.UsersRepo;
import com.waa.minieappbackend.service.UsersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepo usersRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Users> findAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public List<UsersDto> findAllDto(){
        return findAllUsers()
                .stream()
                .map(eachUser -> modelMapper.map(eachUser, UsersDto.class))
                .collect(Collectors.toList());
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
        return productRepo.findAllById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id){
        usersRepo.deleteById(id);
    }

    @Override
    public Users findUserByEmail(String username) {
        return usersRepo.findUsersByUsername(username);
    }

    @Override
    public UsersDto findUserByEmailDto(String email){
        return modelMapper.map(findUserByEmail(email), UsersDto.class);
    }

}
