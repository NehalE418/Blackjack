package com.openmarket.biddingplatformbackend.model;

import com.openmarket.biddingplatformbackend.entity.Review;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProductInfo {
    private ProductType productType;
    private String productName;
    private String owner;
    private String description;
    private BlockingQueue<Review> reviewList=new LinkedBlockingQueue<Review>(10);
    private double rating;
    private int totalReviews;
    public void addReview(Review review){
        reviewList.add(review);
        this.totalReviews++;
        this.setRating(review.getRating());
    }
    private void setRating(int newRating){
        double last=(totalReviews-1)*this.rating;
        last+= newRating;
        last = (double)(last)/totalReviews;
        this.rating = last;
    }
}
