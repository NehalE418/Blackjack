package com.openmarket.biddingplatformbackend.entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.openmarket.biddingplatformbackend.model.ProductInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**A product cannot have reviews, it's an auction item motherfuckers. But people can rate it according to how good they feel it is. So keeping the review system
 * product info will have product type, so no need for the two
 */
@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;//ID of the product
    private String  productInfo;//Will contain the product name, type, description and reviews and ratings, owner of the product
    private Long basePrice;//The price at which the bidding should begin
    private Long currentPrice;//The price that the product is currently trading at
    private long startTime;//When the bidding on the product should start and end
    private long endTime;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"userProducts"})
    private User productSeller;
}
