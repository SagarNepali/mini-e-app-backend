package com.waa.minieappbackend.service.Impl;

import com.spring.assignmentOne.domain.Comment;
import com.spring.assignmentOne.domain.Post;
import com.spring.assignmentOne.domain.Users;
import com.spring.assignmentOne.repo.CommentRepo;
import com.spring.assignmentOne.repo.PostRepo;
import com.spring.assignmentOne.repo.UsersRepo;
import com.spring.assignmentOne.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepo usersRepo;

    @Autowired
    PostRepo postRepo;

    @Autowired
    CommentRepo commentRepo;

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
    public List<Post> findAllPosts(Long id) {
        return postRepo.findAllById(id).orElse(null);
    }

    @Override
    public void addPostToUser(Long id, Post p) {
        if(findUserById(id) != null) {
            p.setUser(findUserById(id));
            postRepo.save(p);
        }
    }

    @Override
    public List<Users> findMoreThanOnePost(int count){
        return usersRepo.findMoreThanOnePost(count);
    }

    @Override
    public void deleteById(Long id){
        usersRepo.deleteById(id);
    }

    @Override
    public List<Users> usersWithAPostTitled(String title){
        return usersRepo.findUsersByPostTitle(title);
    }

    @Override
    public Post findUserByIdAndPost(Long userId, Long postId){
        return postRepo.findById(postId).orElse(null);
    }

    @Override
    public Comment findCommentByUserAndPostId(Long userId, Long postId, Long commentId){
        return commentRepo.findCommentByUserAndPostIdCommentId(userId, postId, commentId);
    }

    @Override
    public Users findUserByEmail(String username) {
        return usersRepo.findUsersByUsername(username);
    }

}
