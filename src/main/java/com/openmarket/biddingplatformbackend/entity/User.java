package com.openmarket.biddingplatformbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//ID of the user which will be generated
    private String name;// Name of the user
    private String email;//Email id and password of the user
    private String password;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private ArrayList <Product> userProducts = new ArrayList <Product>();
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private ArrayList <Bid> biddingHistory = new ArrayList <Bid>();
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private ArrayList <Review> reviewHistory = new ArrayList <Review>();
    @JsonIgnore
    public String getPassword()
    {
        return this.password;
    }
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }
}
