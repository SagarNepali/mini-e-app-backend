package com.waa.minieappbackend.domain.dto;

import com.waa.minieappbackend.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {

    // private long id;
    private String username;
    private String password;
    private List<Role> roles;

}
