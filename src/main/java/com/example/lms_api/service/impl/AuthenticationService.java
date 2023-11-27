package com.example.lms_api.service.impl;

import com.example.lms_api.dao.request.SignInRequest;
import com.example.lms_api.dao.request.SignUpRequest;
import com.example.lms_api.dao.response.JwtAuthenticationResponse;
import com.example.lms_api.service.IAuthenticationService;

public class AuthenticationService implements IAuthenticationService {
    @Override
    public JwtAuthenticationResponse signin(SignInRequest request) {
        return null;
    }

    @Override
    public JwtAuthenticationResponse signup(SignUpRequest request) {
        return null;
    }
}
