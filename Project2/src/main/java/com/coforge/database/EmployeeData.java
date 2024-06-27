package com.coforge.database;
import java.sql.*;

public class EmployeeData {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1 ","root","mysql");

        if(connection!=null)
            System.out.println("Connection successful");
        else
            System.out.println("Connection problem");

        Statement statement= connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from employee");

        while(resultSet.next())
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));

        //System.out.println(resultSet.getInt("id")+"\t"+resultSet.getString("name"));



    }



}
