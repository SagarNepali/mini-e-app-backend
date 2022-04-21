package com.waa.minieappbackend.dao;

import com.waa.minieappbackend.models.DAOUser;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DAOUser, Long> {

    DAOUser findByUsername(String username);
}
