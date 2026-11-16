package com.example.DepartmentEmployeesApi.service;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.DepartmentEmployeesApi.entity.Department;
import com.example.DepartmentEmployeesApi.entity.Employee;
import com.example.DepartmentEmployeesApi.repository.DepartmentRepository;
import com.example.DepartmentEmployeesApi.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(
            EmployeeRepository employeeRepository,
            DepartmentRepository departmentRepository) {

        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    // Add Employee To Department
    public Employee addEmployee(Long departmentId, Employee employee) {

        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() ->
                    new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Department not found"
                    )
                );

        employee.setDepartment(department);

        return employeeRepository.save(employee);
    }

    // Get All Employees
    @Transactional(readOnly = true)
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    // Get Employee By ID
    @Transactional(readOnly = true)
    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() ->
                    new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Employee not found"
                    )
                );
    }

    // Get Employees By Department
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesByDepartment(Long departmentId) {

        if (!departmentRepository.existsById(departmentId)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Department not found"
            );
        }

        return employeeRepository.findByDepartmentId(departmentId);
    }

    // Delete Employee
    public void deleteEmployee(Long id) {

        if (!employeeRepository.existsById(id)) {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Employee not found"
            );
        }

        employeeRepository.deleteById(id);
    }
}