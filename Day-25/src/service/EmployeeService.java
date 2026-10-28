package service;
import model.Employee;
import dao.EmployeeDao;
import java.sql.SQLException;

public class EmployeeService {

    EmployeeDao dao = new EmployeeDao();
    public void addEmployee(Employee e) throws SQLException {
        dao.addEmployee(e);
    }
    public void viewEmployees() throws SQLException {
        dao.viewEmployees();
    }
    public void updateEmployee(int id, String name, double salary, String department)throws SQLException {
        dao.updateEmployee(id, name, salary, department);
    }
    public void deleteEmployee(int id) throws SQLException {
        dao.deleteEmployee(id);
    }
    public void searchEmployee(int id) throws SQLException {
        dao.searchEmployee(id);
    }
}