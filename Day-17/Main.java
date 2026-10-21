import java.util.ArrayList;
import java.util.List;

class Employee {
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override 
    public String toString(){
        return id+" | "+name+" | "+"Rs. "+salary;
    }
}
public class Main {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "A",80000.0));
        emp.add(new Employee(2, "B",50000.0));
        emp.add(new Employee(3, "C",30000.0));
        emp.add(new Employee(4, "D",90000.0));

        System.out.println("Employees earning above 45k: ");
        emp.stream().filter(e -> e.salary >45000.0).forEach(e -> System.out.println(e));

        System.out.println("Sorted order of employees: ");
        emp.stream().sorted((e1,e2) -> Double.compare(e1.salary, e2.salary)).forEach(e->System.out.println(e));

        double totalSalary = emp.stream().mapToDouble(e->e.salary).sum();
        System.out.println("Total salary: "+totalSalary);
        
        String Search = "Khushi";
        System.out.println("Searching for employee named: "+Search);
        emp.stream().filter(e->e.name.equalsIgnoreCase(Search)).findFirst().ifPresentOrElse(e -> System.out.println(e),() ->System.out.println("Employee not found!"));

    }
}
