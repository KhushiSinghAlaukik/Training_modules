public class Employee {
    private int empID, salary;
    private String empName, department, email, password;

    public Employee(int empId, String empName, String department, int salary, String email, String password){
        this.empID = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.password = password;
    }
    public int getEmpID(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public String getDepartment(){
        return department;
    }
    public void SetSalary(int newSalary){
        if(newSalary>0){
            salary = newSalary;
        }
        else{
            System.out.println("Enter valid salary ammount !");
        }
    }
    public void SetEmail(String email){
        if(email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Enter valid email id !");
        }
    }

    public void ChangePass(String Newpassword, String oldpassword){
        if(this.password.equals(oldpassword)){
            this.password = Newpassword;
        }else{
            System.out.println("Enter correct passkey !");
        }
    }

    public void displayEmployee(){
        System.out.println("Employee id: "+empID);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Department: "+department);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee email id: "+email);
    }

    public static void main(String[] args){
        Employee emp = new Employee(1, "Khushi", "Tech", 50000, "khushi@gmail.com", "Khushi");
        emp.getEmpID();
        emp.getEmpName();
        emp.getDepartment();
        emp.displayEmployee();
        emp.SetEmail("Khushi1234@gamil.com");
        emp.SetSalary(60000);
        emp.displayEmployee();
    }
}
