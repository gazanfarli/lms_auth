package com.example.lms_api.service.impl;

import com.example.lms_api.entity.User;
import com.example.lms_api.repository.UserRepository;
import com.example.lms_api.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;


//    @Override
//    public ResponseEntity<User> getUserByEmail(String email) {
//        User user = userRepository.findByEmail(email)
//                .orElseThrow(() -> new Exception(""));
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
}
