/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.ChildModel;
import controller.AddController;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Microsoft Windows
 */
public class Add extends javax.swing.JPanel {
private AddController controller = new AddController();
    /** Creates new form Home */
    public Add() {
        initComponents();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDoB = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrs = new javax.swing.JTextField();
        txtSchool = new javax.swing.JTextField();
        txtAddrs = new javax.swing.JTextField();
        BtnCfr = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        CbRate = new javax.swing.JComboBox<>();
        CbGen = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("THÊM MỚI THÔNG TIN:");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Họ và tên:");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ngày sinh:");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Giới tính:");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Tên phụ huynh:");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Địa chỉ:");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Trường:");

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Lớp:");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Học lưc:");

        txtDoB.setText("DD/MM/YYYY");

        BtnCfr.setText("Xác nhận");
        BtnCfr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCfrActionPerformed(evt);
            }
        });

        BtnReset.setText("Làm mới");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        CbRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "giỏi", "khá", "trung bình", "yếu" }));

        CbGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nam", "nữ" }));

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddrs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CbRate, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CbGen, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnReset)
                        .addGap(67, 67, 67)
                        .addComponent(BtnCfr)
                        .addGap(147, 147, 147)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCfr)
                    .addComponent(BtnReset))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtDoB.setText("DD/MM/YYYY");
        txtAddrs.setText("");
        txtPrs.setText("");
        txtSchool.setText("");
        txtClass.setText("");
        txtID.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnCfrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCfrActionPerformed
        // TODO add your handling code here:
        if(txtcheck()){
            ChildModel t = new ChildModel();
            t.setID(Integer.parseInt(txtID.getText()));
            t.setTenTre(txtName.getText());
            
            try {
                t.setNgaySinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtDoB.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            t.setTenChuHo(txtPrs.getText());
            t.setGioiTinh((String) CbGen.getSelectedItem());
            t.setDiaChi(txtAddrs.getText());
            t.setTruong(txtSchool.getText());
            t.setLop(txtClass.getText());
            t.setThanhTich((String) CbRate.getSelectedItem());
            if(t.getThanhTich().equals("giỏi")){
                t.setSoLuongQua(8);
            }
            else if(t.getThanhTich().equals("khá")){
                t.setSoLuongQua(5);
            }
            try {
                t.setNgayNhanQua(new SimpleDateFormat("dd/MM/yyyy").parse(txtDoB.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }
            t.setLoaiQua("vở");
            try {
                if (this.controller.addChild(t)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công!!");                    
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra. Vui lòng kiểm tra lại!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnCfrActionPerformed
    private boolean txtcheck(){
        if(txtName.getText().trim().isEmpty()
                ||txtDoB.getText().trim().isEmpty()
                ||txtAddrs.getText().trim().isEmpty()
                ||txtPrs.getText().trim().isEmpty()
                ||txtSchool.getText().trim().isEmpty()
                ||txtClass.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập hết các thông tin bắt buộc", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
                int d = Integer.parseInt(txtID.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Số ID không thể chứa các ký tự", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        try {
                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(txtDoB.getText());
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Hãy nhập đúng theo cấu trúc DD//MM/YYYY", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCfr;
    private javax.swing.JButton BtnReset;
    private javax.swing.JComboBox<String> CbGen;
    private javax.swing.JComboBox<String> CbRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddrs;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrs;
    private javax.swing.JTextField txtSchool;
    // End of variables declaration//GEN-END:variables

}
