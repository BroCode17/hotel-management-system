/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ebene
 */
public class InsertUpdateDelete {
    public static void setData(String Query, String msg){
        //Creating Connection
        Connection con = null;
        Statement st = null;
        
        //Load connection
        con = DataConnection.createConnection();// Connection wiht Data Class
        try {
            //Loading statement.
            st = con.createStatement();
            //executing
            st.executeUpdate(Query);
            //Checking if 
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        } catch (SQLException ex) {
            Logger.getLogger(InsertUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally{
//              try {
//            //Loading statement.
//            st = con.createStatement();
//            //executing
//            st.executeUpdate(Query);
//            //Checking if 
//            if(!msg.equals(""))
//                JOptionPane.showMessageDialog(null, st);
//        } catch (SQLException ex) {
//            Logger.getLogger(InsertUpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        }
        
        
    }
}
