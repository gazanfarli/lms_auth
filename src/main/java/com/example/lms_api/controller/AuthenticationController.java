package com.example.lms_api.controller;

import com.example.lms_api.dao.request.SignUpRequest;
import com.example.lms_api.dao.response.JwtAuthenticationResponse;
import com.example.lms_api.service.impl.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/auth/register")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<JwtAuthenticationResponse> register(@RequestBody SignUpRequest request) {
        return authenticationService.signup(request);
    }
}
