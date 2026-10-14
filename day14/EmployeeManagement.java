package day14;
import java.util.*;

class Employee{
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your choice : 1.Add , 2.Update , 3.Delete , 4.Search , 5.Display , 6.Exit ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter Employee id : ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Employee name : ");
                String name = sc.nextLine();
                System.out.println("Enter Employee salary : ");
                double salary = sc.nextDouble();
                Employee e = new Employee(id, name, salary);
                emp.add(e);
            }
            else if(choice == 2){
                System.out.println("Enter the employee id : ");
                int searchid = sc.nextInt();
                for(int i=0; i<emp.size(); i++){
                    if(emp.get(i).id== searchid){
                        System.out.println("Enter the new name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the new salary: ");
                        double salary = sc.nextDouble();
                        emp.set(i, new Employee(searchid, name, salary));
                        System.out.println("Employee updated successfully!");
                    }else{
                        System.out.println("Enter valid id!");
                    }
                }
            }
            else if(choice == 3){
                System.out.println("Enter employee id to delete!");
                int searchid = sc.nextInt();
                for(int i=0; i<emp.size();i++){
                    if(emp.get(i).id == searchid){
                        emp.remove(i);
                    }else{
                        System.out.println("Enter valid id!");
                    }
                }
            }
            else if(choice == 4){
                System.out.println("Enter id to search");
                int id = sc.nextInt();
                for(int i=0; i<emp.size(); i++){
                    if(emp.get(i).id == id){
                        System.out.println(i);
                    }else{
                        System.out.println("Enter valid id!");
                    }
                }
            }
            else if(choice == 5){
                for( Employee e : emp){
                    e.display();
                }
                break;
            }else if(choice == 6){
                break;
            }
            else{
                System.out.println("Enter valid choice!");
            }
        }
    }
}
