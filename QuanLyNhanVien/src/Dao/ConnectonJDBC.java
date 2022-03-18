/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tuanta
 */
public class ConnectonJDBC {
    public static Connection JDBCConnection() {
        final String Url = "jdbc:sqlserver://DESKTOP-VR1HT3E\\SQLEXPRESS:1433;databaseName=quanLyNhanSu";
        final String user = "sa";
        final String pass = "anhtuank56";
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
}
