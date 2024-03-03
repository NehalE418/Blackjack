package com.openmarket.biddingplatformbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "bids")
@Data
@AllArgsConstructor
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //ID of the bid
    private Long bidPrice; //Price at which bid was set
    private Long bidderID; // ID of the user who is placing the bid
    private Long bidTime; // Time at which bid was placed
    @OneToOne
    private Product auctionItem; // Store the auction item
    private User bidder;
}
