class Employee {
    public int empID, salary;
    public String empName;

    public Employee(int empID, String empName, int salary){
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }

    public void Display(){
        System.out.println("Employee id: "+ empID);
        System.out.println("Employee Name: "+ empName);
        System.out.println("Employee Salary: "+ salary);
    }
}
class Developer extends Employee{
    public String language;
    public String projectName;
    public Developer(int empID, String empName, int salary, String language, String projectName){
        super(empID, empName, salary);
        this.language = language;
        this.projectName = projectName;
    }
    
    public void DevFunc(){
        super.Display();
        System.out.println("The developer uses "+language+" language.");
        System.out.println("The developer is working working on "+ projectName );
    }
}

class SeniorDeveloper extends Developer{
    public int experience;
    public SeniorDeveloper(int empID, String empName, int salary, String language, String projectName, int experience){
        super(empID, empName, salary, language, projectName);
        this.experience = experience;
    }
    
    public void SeniorExp(){
        super.Display();
        super.DevFunc();
        System.out.println("The seniorr dev have experience of "+experience+" years");
    }
}

public class Main{
    public static void main(String[] args){
        SeniorDeveloper sde = new SeniorDeveloper(1, "Khushi", 40000, "Java", "Employee Management", 5);
        sde.SeniorExp();
    }
}
