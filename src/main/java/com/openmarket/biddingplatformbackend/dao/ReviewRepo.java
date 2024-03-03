package com.openmarket.biddingplatformbackend.dao;

import com.openmarket.biddingplatformbackend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, Long> {
}
