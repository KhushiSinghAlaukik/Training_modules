package com.example.DepartmentEmployeesApi.service;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.DepartmentEmployeesApi.entity.Department;
import com.example.DepartmentEmployeesApi.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(
            DepartmentRepository departmentRepository) {

        this.departmentRepository = departmentRepository;
    }

    // Add Department
    public Department addDepartment(Department department) {

        return departmentRepository.save(department);
    }

    // Get All Departments
    @Transactional(readOnly = true)
    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }

    // Get Department By ID
    @Transactional(readOnly = true)
    public Department getDepartmentById(Long id) {

        return departmentRepository.findById(id)
                .orElseThrow(() ->
                    new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Department not found"
                    )
                );
    }

    // Delete Department
    public void deleteDepartment(Long id) {

        Department department = getDepartmentById(id);

        departmentRepository.delete(department);
    }
}