package com.openmarket.biddingplatformbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//ID of the user which will be generated
    @Column(name="name")
    private String name;// Name of the user
    @Column(name="email")
    private String email;//Email id and password of the user
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "productSeller", cascade = CascadeType.ALL)
    private List<Product> userProducts = new ArrayList <Product>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List <Bid> biddingHistory = new ArrayList <Bid>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List <Review> reviewHistory = new ArrayList <Review>();
    @JsonIgnore
    public String getPassword()
    {
        return this.password;
    }
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

    public User(){
        this.userProducts=new ArrayList<>();
        this.biddingHistory=new ArrayList<>();
        this.reviewHistory=new ArrayList<>();
    }
}
