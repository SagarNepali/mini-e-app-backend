package com.waa.minieappbackend.domain.dto;

import lombok.Data;

@Data
public class PostDto { // removing content
    private int id;
    private String title;
    private String author;
}
