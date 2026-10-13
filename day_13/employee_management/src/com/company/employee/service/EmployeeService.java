package day_13.employee_management.src.com.company.employee.service;
import day_13.employee_management.src.com.company.employee.model.Employee;
import day_13.employee_management.src.com.company.employee.util.Validator;

public class EmployeeService {
    public void show(){
    Employee emp = new Employee(1, "ABCD", 50000.0);
    Validator.Display(emp);
}
}
