package com.openmarket.biddingplatformbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="reviews")
@Data
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    @Column(name = "comment")
    private String comment;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "product_id")
    private Long productId;
    @Column(name ="rating")
    private int rating;

 }
