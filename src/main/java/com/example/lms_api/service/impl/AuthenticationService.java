package com.example.lms_api.service.impl;

import com.example.lms_api.dao.request.SignInRequest;
import com.example.lms_api.dao.request.SignUpRequest;
import com.example.lms_api.dao.response.JwtAuthenticationResponse;
import com.example.lms_api.repository.UserRepository;
import com.example.lms_api.service.IAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<JwtAuthenticationResponse> signin(SignInRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<JwtAuthenticationResponse> signup(SignUpRequest request) {
        return null;
    }
}
