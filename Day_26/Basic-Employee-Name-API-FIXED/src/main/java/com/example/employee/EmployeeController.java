package com.example.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    private final List<String> employees = new ArrayList<>(List.of("Aman", "Priya"));

    @GetMapping("/employees")
    public List<String> getEmployees() {
        return employees;
    }

    @PostMapping("/employees")
    public ResponseEntity<String> addEmployee(@RequestBody String name) {
        if (name == null || name.isBlank()) {
            return ResponseEntity.badRequest().body("Employee name is required");
        }
        employees.add(name.trim());
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee added: " + name.trim());
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable int id, @RequestBody String name) {
        if (id < 1 || id > employees.size()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "Employee not found"));
        }
        if (name == null || name.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Employee name is required"));
        }
        employees.set(id - 1, name.trim());
        return ResponseEntity.ok("Employee name updated");
    }

    @PatchMapping("/employees/{id}")
    public ResponseEntity<?> patchEmployee(@PathVariable int id, @RequestBody String name) {
        if (id < 1 || id > employees.size()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "Employee not found"));
        }
        if (name == null || name.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Employee name is required"));
        }
        employees.set(id - 1, name.trim());
        return ResponseEntity.ok("Employee name changed");
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
        if (id < 1 || id > employees.size()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "Employee not found"));
        }
        employees.remove(id - 1);
        return ResponseEntity.ok("Employee deleted");
    }
}
