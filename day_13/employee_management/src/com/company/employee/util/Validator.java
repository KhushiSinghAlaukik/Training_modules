package day_13.employee_management.src.com.company.employee.util;
import day_13.employee_management.src.com.company.employee.model.Employee;

public class Validator {
     public static void Display(Employee emp){
        System.out.println("Employee id: "+emp.getID());
        System.out.println("Employee Name: "+emp.getName());
        System.out.println("Employee Salary: "+emp.getSalary());
     }
}
