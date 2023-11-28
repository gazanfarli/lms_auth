package com.example.lms_api.service;


import com.example.lms_api.dao.request.SignInRequest;
import com.example.lms_api.dao.request.SignUpRequest;
import com.example.lms_api.dao.response.JwtAuthenticationResponse;
import org.springframework.http.ResponseEntity;

public interface IAuthenticationService {
    ResponseEntity<JwtAuthenticationResponse> signin(SignInRequest request);
    ResponseEntity<JwtAuthenticationResponse> signup(SignUpRequest request);
}
