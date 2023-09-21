/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import database.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ebene
 */
public class forgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form forgotPassword
     */
    public forgotPassword() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        securityQues.setEditable(false);
         verify.setEnabled(false);
         newPassword.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        securityQues = new javax.swing.JTextField();
        securityAns = new javax.swing.JTextField();
        newPassword = new javax.swing.JPasswordField();
        save = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        verify = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1370, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Forgot Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        emailTextField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 280, -1));

        securityQues.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(securityQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 280, -1));

        securityAns.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(securityAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 313, 280, -1));

        newPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 280, -1));

        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Signup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 40, 35));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        verify.setText("Verify");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        getContentPane().add(verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pexels-quark-studio-2506988.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 750));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
        //
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int flag = 0;
        String email = emailTextField.getText();
        securityQues.setEditable(false);
         verify.setEnabled(false);
         newPassword.setEditable(false);
        if(email.equals("")){
            flag = 1;
            JOptionPane.showMessageDialog(null, "Email is required");
        }else{
        //Retriving data from data base and compare
        ResultSet rs = Selector.getData("select * from users where email='"+email+"'");
         try {
            if(rs.next()){
                flag = 1;
                emailTextField.setEditable(false);
                securityQues.setEditable(false);
                
                securityQues.setText(rs.getString(4));   
                verify.setEnabled(true);
            }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
         }//enod of catch
        }//end else
        if(flag == 0){
            JOptionPane.showMessageDialog(null, "Incorrect Email");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want close this app","Select",JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         String email = emailTextField.getText();
         String newPassword = this.newPassword.getText();
         String sQuestoin = securityQues.getText();
         String sAns = securityAns.getText();
         int flag = 0;
         if(newPassword.equals("")){
            JOptionPane.showMessageDialog(null, "All Field Are Required");
          }else{
            try {
             ResultSet rs = Selector.getData("select * from users where securityQuestion='"+sQuestoin+"' and answer='"+sAns+"'");
             //if its true the 
             if(rs.next()){
                 flag = 1;
                 //Calling the database  InsertUpdateDelect
                       String setPassword ="update users set password='"+newPassword+"' where email='"+email+"'";
                       InsertUpdateDelete.setData(setPassword, "Password Changed Successfully");
                       setVisible(false);
                       new forgotPassword().setVisible(true);
            }
           } catch (HeadlessException | SQLException e) {
               JOptionPane.showMessageDialog(null, e);
            }
         }
    }//GEN-LAST:event_saveActionPerformed

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
        // TODO add your handling code here:
        String getAns = securityAns.getText();
        System.out.println(getAns);
        int flag = 0;
        boolean end = false;
        if(getAns.equals("")){
            JOptionPane.showMessageDialog(null, "All Field Are Required");
        }else{
            ResultSet rs = Selector.getData("select * from users where answer='"+getAns+"'");
            try {
               
                if(rs.next()){
                    flag = 1;
                    newPassword.setEnabled(true);
                    newPassword.setEditable(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Answer");
                }
            } catch ( SQLException ex ) {
               // JOptionPane.showMessageDialog(null, e);
               System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_verifyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signup().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField securityAns;
    private javax.swing.JTextField securityQues;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
