package com.waa.minieappbackend.dao;

import com.waa.minieappbackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
