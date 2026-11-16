package com.example.controller;

import com.example.service.ProductService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<String> getAllProducts() {

        System.out.println("Product Controller: Fetching all products...");

        return productService.getAllProducts();
    }

    public String getProductById(int id) {

        System.out.println("Product Controller: Fetching product...");

        return productService.getProductById(id);
    }
}