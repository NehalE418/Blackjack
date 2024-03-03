package com.openmarket.biddingplatformbackend.controller;

import com.openmarket.biddingplatformbackend.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping( "/save-user")
    public ResponseEntity <String> saveUser(@RequestBody User newUser)
    {

    }
}
