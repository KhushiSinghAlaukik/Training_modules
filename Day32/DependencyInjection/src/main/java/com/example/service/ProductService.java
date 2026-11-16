package com.example.service;

import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<String> getAllProducts() {

        System.out.println("Product Service: Getting all products...");

        return productRepository.findAll();
    }

    public String getProductById(int id) {

        System.out.println("Product Service: Getting product by ID...");

        return productRepository.findById(id);
    }
}