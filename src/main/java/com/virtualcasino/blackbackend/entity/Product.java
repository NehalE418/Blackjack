package com.virtualcasino.blackbackend.entity;

import com.virtualcasino.blackbackend.model.ProductType;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Data
public class Product {
    private long productId;
    private ProductType productType;
    private String productInfo;
    private Long price;
    private BlockingQueue<Review> reviewList=new LinkedBlockingQueue<Review>(10);
    private double rating;
    private int totalReviews;
    public void addReview(Review review){
            reviewList.add(review);
            this.totalReviews++;
            this.setRating();
    }
    private void setRating(){
        Double last=(totalReviews-1)*this.rating;

    }

}
