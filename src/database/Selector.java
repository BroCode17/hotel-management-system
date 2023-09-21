/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author ebene
 */
public class Selector {
    //Creating method to connect the data base
    public static ResultSet getData(String query){
        //Connection
        Connection con = null;
        Statement stmt = null;
        //Getting connecton from DataConnection Class
        try {
            con = DataConnection.createConnection();
            stmt = con.createStatement();
            ResultSet rs;//Store the results
            rs = stmt.executeQuery(query);
            //returning select
            return rs;
            
        } catch (Exception e) {
            return  null;
        }
        
        
    }
    
}
