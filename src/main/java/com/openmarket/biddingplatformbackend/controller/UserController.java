package com.openmarket.biddingplatformbackend.controller;

import com.openmarket.biddingplatformbackend.entity.Product;
import com.openmarket.biddingplatformbackend.entity.User;
import com.openmarket.biddingplatformbackend.services.ProductService;
import com.openmarket.biddingplatformbackend.services.UserService;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        return new Random().ints(length, 0, CHARACTERS.length())
                .mapToObj(CHARACTERS::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    @GetMapping( "/save-user")
    public User saveUser()
    {
        User user=new User();
        user.setName("Nehal");
        user.setPassword("huluhulu");
        String mail=generateRandomString(10);

        user.setEmail(mail);
        userService.saveUser(user);
        Product product=new Product();
//        product.setProductSeller(user);
        product.setProductInfo("Harley davidson Big Bob ");
        product.setBasePrice(100000L);
        product.setCurrentPrice(1200000L);
        product.setStartTime(System.currentTimeMillis());
        product.setEndTime(System.currentTimeMillis()+60*60*1000*24L);
        productService.saveProduct(product);
        return userService.getUserByMail("sknehal2112@gmail.com");
    }
}
