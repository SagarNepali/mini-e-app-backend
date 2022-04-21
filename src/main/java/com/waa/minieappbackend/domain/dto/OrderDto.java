package com.waa.minieappbackend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private long id;
    private Date date;
    // if more properties are added it becomes the entity itself;

}
