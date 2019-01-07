package com.halx.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestJdbc {
    public static void main(String[] args) {
        final String jdbcUrl = "jdbc:postgresql://localhost:5432/udemySpringHibernate";
        final String user = "hbstudent";
        final String password = "hbstudent";

        try{
            //Loading the postgres driver. the driver will automatically register itself with jdbc
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connected to the PostGres server successfully opened !");
            
            connection.close();
            System.out.println("Connected to the PostGres server successfully closed !");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
