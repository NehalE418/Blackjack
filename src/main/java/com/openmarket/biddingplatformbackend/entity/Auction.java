package com.openmarket.biddingplatformbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="auctions")
public class Auction {
    @Id
    @Column(name = "auction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;
    @Column(name ="curr_price")
    private Long currentPrice;
    @Column(name = "slr_id")
    private Long sellerId;
    @Column(name = "prd_id")
    private Long productId;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "event_participant",
            joinColumns = @JoinColumn(name = "auction_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> participants = new ArrayList<>();
    @Column(name = "srt_price")
    private Long basePrice;
    @Column(name = "srt_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
}
