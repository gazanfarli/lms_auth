package com.example.lms_api.service;


import com.example.lms_api.dao.request.SignInRequest;
import com.example.lms_api.dao.request.SignUpRequest;
import com.example.lms_api.dao.response.JwtAuthenticationResponse;

public interface IAuthenticationService {
    JwtAuthenticationResponse signin(SignInRequest request);
    JwtAuthenticationResponse signup(SignUpRequest request);
}
