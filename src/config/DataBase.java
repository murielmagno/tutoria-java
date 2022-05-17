package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    public Connection conect(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/escola";
        String username = "postgres";
        String password = "123";
        try {
            return DriverManager.getConnection(jdbcURL,username,password);
        }catch (SQLException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        return null;
    }
}
