import java.util.Scanner;
import model.Employee;
import service.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter department: ");
                    String department = sc.nextLine();
                    Employee e = new Employee(name, salary, department);
                    service.addEmployee(e);
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter new department: ");
                    String newDepartment = sc.nextLine();

                    service.updateEmployee(updateId, newName, newSalary, newDepartment);
                    break;

                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    service.deleteEmployee(deleteId);
                    break;

                case 5:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();
                    service.searchEmployee(searchId);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}