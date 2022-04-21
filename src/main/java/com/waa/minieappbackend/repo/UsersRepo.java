package com.waa.minieappbackend.repo;

import com.waa.minieappbackend.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepo extends CrudRepository<Users, Long> {

    List<Users> findAll();

    Optional<Users> findById(Long id);

    void deleteById(Long id);


    Users findUsersByUsername(String email);

}
