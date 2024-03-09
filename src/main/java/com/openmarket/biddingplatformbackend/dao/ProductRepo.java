package com.openmarket.biddingplatformbackend.dao;

import com.openmarket.biddingplatformbackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM products WHERE product_name LIKE %:name%", nativeQuery = true)
    List <Product> findProductByName(@Param("name") String name);
    @Query(value = "SELECT * FROM products WHERE user_id = :ownerId", nativeQuery = true)
    List <Product> findProductByOwnerName(@Param("ownerId") Long ownerID);
}
