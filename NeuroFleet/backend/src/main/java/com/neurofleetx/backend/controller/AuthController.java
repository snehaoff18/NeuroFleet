package com.neurofleetx.backend.controller;

import com.neurofleetx.backend.dto.*;
import com.neurofleetx.backend.model.User;
import com.neurofleetx.backend.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {

        User user = authService.register(
                request.getName(),
                request.getEmail(),
                request.getPassword(),
                request.getPhone(),
                request.getRole()
        );

        return ResponseEntity.ok(
                new ApiResponse(true, "User registered successfully", user)
        );
    }

    @PostMapping("/login")
public ResponseEntity<?> login(@RequestBody LoginRequest request) {

    String token = authService.login(
            request.getEmail(),
            request.getPassword()
    );

    return ResponseEntity.ok(
            new ApiResponse(true, "Login successful", token)
    );
}

}
