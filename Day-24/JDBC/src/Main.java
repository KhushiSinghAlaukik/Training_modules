import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee_db";
        String username = "root";
        String password = "pass123";

        try {
            Connection con =
                DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully!");

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}