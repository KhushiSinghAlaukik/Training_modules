package com.example.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final List<String> products =
            List.of("Laptop", "Keyboard", "Mouse");

    public List<String> findAll() {

        System.out.println("Product Repository: Fetching products...");

        return products;
    }

    public String findById(int id) {

        System.out.println("Product Repository: Finding product...");

        if (id < 1 || id > products.size()) {
            return "Product not found";
        }

        return products.get(id - 1);
    }
}