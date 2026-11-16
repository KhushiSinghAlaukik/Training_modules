package com.example.SpringSecurityJWT.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    // ADMIN only
    @GetMapping("/admin/dashboard")
    public String adminDashboard() {

        return "Welcome ADMIN! You have admin access.";
    }

    // ADMIN and EMPLOYEE
    @GetMapping("/employee/profile")
    public String employeeProfile() {

        return "Welcome! You can access the employee profile.";
    }

    // EMPLOYEE only
    @GetMapping("/employee/tasks")
    public String employeeTasks() {

        return "Here are your employee tasks.";
    }
}