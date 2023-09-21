/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ebene
 */
public class tables {
   // Connection con;
    
    public static void main(String[] args) {
        //Creating connection
        Connection con = null;
        Statement st = null;
       // String Query;
        try {
            //Creating connection
             con = DataConnection.createConnection();
            //loading connection
             st = con.createStatement();
             //Executing Statement
            // st.executeUpdate("create table users(name varchar(100), email varchar(100), password varchar(50), securityQuestion varchar(200),answer varchar(500), address varchar(200), status varchar(20), usertype varchar(20))");
             //Creating Table for roomMagage
           //st.executeUpdate("create table room(roomNum varchar(100), roomType varchar(200), bed varchar(100), price int, status varchar(20))");
            //Creating Table for Customer CheckIn
            st.executeUpdate("create table customer(id int, name varchar(200), moblieNum int, nationality varchar(200), gender varchar(50), email varchar(200), idProof varchar(50), address varchar(100), checkIn varchar(50), bed varchar(50), roomType varchar(50), roomNum varchar(50), pricePeyDay int(10), numberOfDaysStayed int(10), totalPrice varchar(100), checkout varchar(50))");
             JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
       
    }
    
}
