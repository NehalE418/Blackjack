package com.openmarket.biddingplatformbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "bids")
@Data
@AllArgsConstructor
public class Bid {
    @Id
    @Column(name="bid_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bidId; //ID of the bid
    @Column(name="bid_price")
    private Long bidPrice; //Price at which bid was set
    @Column(name = "bid_time")
    private Date bidTime; // Time at which bid was placed
    @Column(name = "product_id")
    private Long productId; // Store the auction item
    @Column(name = "auction_id")
    private Long auctionId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
