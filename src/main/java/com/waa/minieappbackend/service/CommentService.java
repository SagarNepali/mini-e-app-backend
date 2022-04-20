package com.waa.minieappbackend.service;

import com.spring.assignmentOne.domain.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {

    void addCommentByPostId(Long id, Comment c);

}
