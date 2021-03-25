package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatmentDemo {
    public static void main(String[] args) {
        try {
            int id;
            String name, address;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id");
            id = scanner.nextInt();
            System.out.println("enter name");
            name = scanner.next();
            System.out.println("enter address");
            address = scanner.next();
            String str = "insert into employee(id,name,address)values(?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb", "root", "mohann@123");
            PreparedStatement statement = connection.prepareStatement(str);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, address);
            int i = statement.executeUpdate();
            System.out.println("row inserted=>" + i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
