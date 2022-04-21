package com.waa.minieappbackend.controller;


import com.waa.minieappbackend.config.JwtTokenUtil;
import com.waa.minieappbackend.models.request.AuthenticationRequest;
import com.waa.minieappbackend.models.response.AuthenticationResponse;
import com.waa.minieappbackend.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authRequest)
            throws Exception {
        try {
            authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getUsername(),
                            authRequest.getPassword()
                    ));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect Credential details ", e);
        }

        final UserDetails userDetails =
                myUserDetailsService.loadUserByUsername(authRequest.getUsername());
        final String authToken = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok().body( new AuthenticationResponse(authToken));
    }

}
