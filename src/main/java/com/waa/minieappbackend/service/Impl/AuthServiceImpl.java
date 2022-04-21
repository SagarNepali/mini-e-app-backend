package com.waa.minieappbackend.service.Impl;

import com.waa.minieappbackend.config.JwtTokenUtil;
import com.waa.minieappbackend.models.request.AuthenticationRequest;
import com.waa.minieappbackend.models.response.AuthenticationResponse;
import com.waa.minieappbackend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    @Autowired
    private final AuthenticationManager authenticationManager;

    private final UserDetailsService userDetailsService;

    private final JwtTokenUtil jwtUtil;


    @Override
    public AuthenticationResponse login(AuthenticationRequest loginRequest){
        try {
            var result = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                            loginRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            System.out.println("Bad Credentials");
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(loginRequest.getUsername());

        final String accessToken = jwtUtil.generateToken(userDetails);
//        final String refreshToken = jwtUtil.generateRefreshToken(loginRequest.getEmail());
        var loginResponse = new AuthenticationResponse(accessToken);//, refreshToken);
        return loginResponse;
    }

}
