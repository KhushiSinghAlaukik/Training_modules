package com.example;

import com.example.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ProductController controller =
                context.getBean(ProductController.class);

        System.out.println("\nProducts:");

        controller.getAllProducts().forEach(System.out::println);

        System.out.println("\nSearching Product:");

        String product = controller.getProductById(2);

        System.out.println("Product Found: " + product);

        context.close();
    }
}