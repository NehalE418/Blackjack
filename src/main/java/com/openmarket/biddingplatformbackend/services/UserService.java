package com.openmarket.biddingplatformbackend.services;

import com.openmarket.biddingplatformbackend.entity.User;


public interface UserService {
    public User getUserByMail(String email);
    public void saveUser(User newUser);
}
