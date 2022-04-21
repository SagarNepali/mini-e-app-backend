package com.waa.minieappbackend.controller;


//@RestController
//@RequestMapping("/auth")
//@CrossOrigin
public class AuthController {

//    @Autowired
//    private AuthenticationManager authManager;
//
//    @Autowired
//    private MyUserDetailsService myUserDetailsService;
//
//    @Autowired
//    private JwtUtil jwtTokenUtil;
//
//    @PostMapping
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authRequest)
//            throws Exception {
//        try {
//            authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            authRequest.getUsername(),
//                            authRequest.getPassword()
//                    ));
//        } catch (BadCredentialsException e) {
//            throw new Exception("Incorrect Credential details ", e);
//        }
//
//        final UserDetails userDetails =
//                myUserDetailsService.loadUserByUsername(authRequest.getUsername());
//        final String authToken = jwtTokenUtil.generateToken(userDetails);
//        return ResponseEntity.ok().body( new AuthenticationResponse(authToken));
//    }
}
