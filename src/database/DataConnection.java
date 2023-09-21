/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ebene
 */
public class DataConnection {
   
    public  static Connection createConnection(){
        try {
            //Creating connector
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Loading connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdata", "root", "root");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
