package com.example.EmployeeDepartmentMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeDepartmentMySQL.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}