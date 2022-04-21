package com.waa.minieappbackend.controller;


import com.waa.minieappbackend.domain.Users;
import com.waa.minieappbackend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Users> findAllUsers(){
        return usersService.findAllUsers();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Users findUsersById(@PathVariable("id") Long id){
        return usersService.findUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveNewUser(@RequestBody Users newUser){
        usersService.createUser(newUser);
    }


//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/{id}/posts")
//    public void addProductToUser(@RequestBody Product p, @PathVariable("id") Long id){
//        usersService.addProductToUser(id, p);
//    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        usersService.deleteById(id);
    }

}
