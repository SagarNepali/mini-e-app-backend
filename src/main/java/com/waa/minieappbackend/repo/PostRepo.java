package com.waa.minieappbackend.repo;

import com.spring.assignmentOne.domain.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepo extends CrudRepository<Post, Long> {

    List<Post> findAll();

    Optional<Post> findById(Long id);

    Optional<List<Post>> findAllById(Long id);

    void deleteById(Long id);

    @Query("select p from Post p where p.title = :title")
    List<Post> findPostByTitle(String title);
    
}

