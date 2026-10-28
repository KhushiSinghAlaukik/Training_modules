package model;
public class Employee {

    int id;
    String name;
    double salary;
    String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
    return name;
    }
    public double getSalary() {
    return salary;
    }
    public String getDepartment() {
    return department;
    }
}