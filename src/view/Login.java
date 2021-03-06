/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import controller.LoginController;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
/**
 *
 * @author Microsoft Windows
 */
public class Login extends javax.swing.JFrame {
private LoginController cont = new  LoginController();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(760,430);
        setResizable(false);
        setTitle("Đăng Nhập");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txbPasswd = new javax.swing.JPasswordField();
        BtnCfr1 = new javax.swing.JButton();
        BtnCfr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Tên đăng nhập:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 130, 106, 19);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(460, 130, 268, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Mật khẩu:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 190, 66, 19);

        txbPasswd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txbPasswd.setName("txtPasswd"); // NOI18N
        getContentPane().add(txbPasswd);
        txbPasswd.setBounds(460, 180, 268, 30);

        BtnCfr1.setText("Xác nhận");
        BtnCfr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCfr1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCfr1);
        BtnCfr1.setBounds(610, 250, 100, 30);

        BtnCfr.setText("Làm mới");
        BtnCfr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCfrActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCfr);
        BtnCfr.setBounds(480, 250, 90, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Đăng Nhập");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 30, 134, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/giftImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void BtnCfrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCfrActionPerformed
        // TODO add your handling code here:
       txtName.setText("");
       txbPasswd.setText("");
    }//GEN-LAST:event_BtnCfrActionPerformed

    private void BtnCfr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCfr1ActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().equals("")
                ||String.valueOf(txbPasswd.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String userName = txtName.getText();
        String password = String.valueOf(txbPasswd.getPassword());
        try {
            if (this.cont.login(userName, password)) {
                dispose();
                Main mainFrame = new Main();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setResizable(false);
                mainFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai thong tin dang nhap", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!! Vui lòng kiểm tra lại!", "Warning!!", JOptionPane.ERROR_MESSAGE);
        }
            
        }
        
    }//GEN-LAST:event_BtnCfr1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCfr;
    private javax.swing.JButton BtnCfr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txbPasswd;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
