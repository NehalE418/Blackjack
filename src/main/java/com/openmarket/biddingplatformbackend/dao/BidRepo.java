package com.openmarket.biddingplatformbackend.dao;

import com.openmarket.biddingplatformbackend.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BidRepo extends JpaRepository<Bid, Long> {
    @Query(value = "SELECT * FROM bids WHERE product_id = :productID", nativeQuery = true)
    List <Bid> findBidsByProductId(@Param("productID") Long productID);
}
