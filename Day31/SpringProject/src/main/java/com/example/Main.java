package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Creating Spring Container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieving Car Bean
        Car car = context.getBean(Car.class);

        // Calling method
        car.drive();

        // Closing Spring Container
        ((AnnotationConfigApplicationContext) context).close();

    }
}