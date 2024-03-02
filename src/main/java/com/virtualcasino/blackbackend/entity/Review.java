package com.virtualcasino.blackbackend.entity;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Review {
    private Long reviewId;
    private String comment;
    private Long userId;
    private Long productId;
    private int rating;

 }
