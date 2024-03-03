package com.openmarket.biddingplatformbackend.services;

import com.openmarket.biddingplatformbackend.dao.UserRepo;
import com.openmarket.biddingplatformbackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo ;
    @Override
    public User getUserByMail(String email) {
        return userRepo.findByMail(email);
    }
    @Override
    public void saveUser(User newUser){
        userRepo.save(newUser);
    }
}
