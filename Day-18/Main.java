import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int id;
    private String name, department;
    private double salary;

    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDep(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
    @Override 
    public String toString(){
         return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: Rs." + salary; 
    }
}
public class Main {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "A", "IT", 45000.0));
        emp.add(new Employee(2, "B", "HR", 75000.0));
        emp.add(new Employee(3, "C", "IT", 55000.0));
        emp.add(new Employee(4, "D", "HR", 85000.0));
        emp.add(new Employee(5, "E", "IT", 65000.0));
        
        System.out.println("Employees having salary > 50000 !");
        emp.stream().filter(employee -> employee.getSalary()>50000).forEach(System.out::println);

        System.out.println("Employees by department !");
        emp.stream().map(employee -> employee.getDep()).distinct().forEach(System.out::println);
        System.out.println("Employee having highest salary !");
        emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
        System.out.println("Average salary !");
        double avgSalary = emp.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("Rs. "+avgSalary);
    }
}
