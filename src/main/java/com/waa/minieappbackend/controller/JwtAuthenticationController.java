package com.waa.minieappbackend.controller;

import com.waa.minieappbackend.models.request.AuthenticationRequest;
import com.waa.minieappbackend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	private AuthService authService;

	// Registrations
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
//		return ResponseEntity.ok(userDetailsService.save(user));
//	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {
		return ResponseEntity.ok(authService.login(authenticationRequest));
	}

//	@PostMapping("/refreshToken")
//	public ResponseEntity<?> refreshToken(@RequestBody AuthenticationResponse refreshTokenRequest) {
//		return ResponseEntity.ok(authService.refreshToken(refreshTokenRequest));
//	}

}