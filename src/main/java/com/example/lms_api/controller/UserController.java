package com.example.lms_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {
    public String getUser() {
        return "Yeah buddy, you made it";
    }
}
