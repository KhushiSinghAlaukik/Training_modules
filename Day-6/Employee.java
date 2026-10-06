class Employee {
    int id, salary;
    String name, department;
    
    public Employee(int id, String name, String department, int salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this. salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+ name);
        System.out.println("Employee department: "+department);
        System.out.println("Employee dalary: "+salary);
    }

    public static void main(String[] args){
        Employee Obj1 = new Employee(1, "ABC", "Tech", 90000);
        Obj1.displayDetails();
    }
}

