package dao;
import model.*;
import java.sql.*;

public class EmployeeDao {
    String url = "jdbc:mysql://localhost:3306/employee_db";
    String username = "root";
    String password = "pass123"; 

    private Connection getConnection() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC driver not found!", e);
        }

        return DriverManager.getConnection(url, username, password);
    }
    // Add Employee
    public void addEmployee(Employee e) throws SQLException {
        Connection con = getConnection();
        String sql = "INSERT INTO employees (name, salary, department_id) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, e.getName());
        ps.setDouble(2, e.getSalary());
        ps.setString(3, e.getDepartment());
        ps.executeUpdate();
        System.out.println("Employee added successfully!");
        ps.close();
        con.close();
    }

    // View Employees
    public void viewEmployees() throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees");
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getDouble("salary") + " | " +
                rs.getString("department")
            );
        }
        rs.close();
        st.close();
        con.close();
    }

    // Update Employee
    public void updateEmployee(int id, String name, double salary, String department)throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "UPDATE employees SET name=?, salary=?, department=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setDouble(2, salary);
        ps.setString(3, department);
        ps.setInt(4, id);
        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
        ps.close();
        con.close();
    }

    // Delete Employee
    public void deleteEmployee(int id) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "DELETE FROM employees WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        if (rows > 0) {
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
        ps.close();
        con.close();
    }

    // Search Employee
    public void searchEmployee(int id) throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM employees WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Salary: " + rs.getDouble("salary"));
            System.out.println("Department: " + rs.getString("department"));
        } else {
            System.out.println("Employee not found.");
        }
        rs.close();
        ps.close();
        con.close();
    }
}