package com.openmarket.biddingplatformbackend.services.impl;

import com.openmarket.biddingplatformbackend.dao.ProductRepo;
import com.openmarket.biddingplatformbackend.entity.Product;
import com.openmarket.biddingplatformbackend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public void saveProduct(Product product) {
        productRepo.save(product);
    }
}
