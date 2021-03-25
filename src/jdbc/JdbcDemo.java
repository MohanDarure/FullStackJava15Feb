package jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb","root","mohann@123");
            Statement statement= connection.createStatement();
            String sql="select * from employee";
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String address=rs.getString(3);
                System.out.println("id=>"+id+" name=>" +name+" address=>"+address);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
