package com.example.SpringSecurityJWT.config;

import com.example.securityapi.entity.AppUser;
import com.example.securityapi.entity.Role;
import com.example.securityapi.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AdminBootstrap {

    @Bean
    public CommandLineRunner createAdmin(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (!userRepository.existsByUsername("admin")) {

                AppUser admin = new AppUser();

                admin.setUsername("admin");

                admin.setPassword(
                        passwordEncoder.encode("Admin@12345")
                );

                admin.setRole(Role.ADMIN);

                userRepository.save(admin);

                System.out.println("Demo ADMIN account created.");
            }
        };
    }
}
