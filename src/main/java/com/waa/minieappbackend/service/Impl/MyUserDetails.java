package com.waa.minieappbackend.service.Impl;

import lombok.ToString;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@ToString
public class MyUserDetails{//} implements UserDetails {
//
//    private String username;
//    private String password;
//    private List<Role> roles;
//
//    public MyUserDetails(Users user) {
//        System.out.println("user = " + user);
//        this.username = user.getUsername();
//        this.password = user.getPassword();
//        this.roles = user.getRoles();
//    }
//    public MyUserDetails() { }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return roles.stream()
//                .map(eachRole -> new SimpleGrantedAuthority(eachRole.getRole()))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

}
