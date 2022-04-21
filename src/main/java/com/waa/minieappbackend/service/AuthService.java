package com.waa.minieappbackend.service;

import com.waa.minieappbackend.models.request.AuthenticationRequest;
import com.waa.minieappbackend.models.response.AuthenticationResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    AuthenticationResponse login(AuthenticationRequest loginRequest);

}
