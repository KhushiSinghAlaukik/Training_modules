package day_13.employee_management.src.com.company.employee.model;

public class Employee {
    private int empId;
    private String name;
    private Double salary;

    public Employee(int empId, String name, Double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getID(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
