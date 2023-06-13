/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jframe;
import java.sql.*;

/**
 *
 * @author mycomputer
 */
public class DBConnection {
    public static Connection getConnection() throws Exception {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms?autoReconnect=true&useSSL=false","root","123456mtmtmtSon");
        
        return con;
    }
    
}
