
package com.smkn4.inventaristic.admin.barang.stok;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Boolean.TRUE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import customDateFormatter.CustomDateFormatter;
import com.smkn4.inventaristic.util.MySqlConnection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Calendar;
import org.apache.commons.lang3.time.DateFormatUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aip
 * @author Raihan
 */
public class ManageDataStok extends javax.swing.JDialog {

    /**
     * Creates new form ManageDataStok
     */
    Connection koneksi;
    String action;
    public ManageDataStok(java.awt.Frame parent, boolean modal, String act, String idBarang) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        koneksi = MySqlConnection.getConnection();
        action = act;
        if (action.equals("Edit")){
            txtIdBarang.setEnabled(false);
            showData(idBarang);
        }
        //mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        
        //membuat kordinat
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJenis = new javax.swing.ButtonGroup();
        txtIdBarang = new javax.swing.JTextField();
        lblIDBarang = new javax.swing.JLabel();
        lblNamaBarang = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        lblJenisBarang = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblLokasi = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        rdJangkaPanjang = new javax.swing.JRadioButton();
        rdJangkaPendek = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtIdBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBarangActionPerformed(evt);
            }
        });

        lblIDBarang.setText("Id Barang");

        lblNamaBarang.setText("Nama Barang");

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        lblJenisBarang.setText("Jenis Barang");

        lblStatus.setText("Status");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        lblLokasi.setText("Lokasi Barang");

        txtLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLokasiActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnJenis.add(rdJangkaPanjang);
        rdJangkaPanjang.setText("Barang Jangka Panjang");
        rdJangkaPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdJangkaPanjangActionPerformed(evt);
            }
        });

        btnJenis.add(rdJangkaPendek);
        rdJangkaPendek.setText("Barang Jangka Pendek");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblStatus)
                                            .addComponent(lblJenisBarang))
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNamaBarang)
                                        .addGap(6, 6, 6))
                                    .addComponent(lblIDBarang))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdJangkaPanjang)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdJangkaPendek))
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtIdBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLokasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDBarang)
                            .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblNamaBarang))
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisBarang)
                    .addComponent(rdJangkaPanjang)
                    .addComponent(rdJangkaPendek))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLokasi))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBarangActionPerformed

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLokasiActionPerformed

    private void rdJangkaPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdJangkaPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdJangkaPanjangActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       if(action.equals("Edit")) editData();
        else simpanData();
        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed
    public String getTanggal() {
        return DateFormatUtils.format(Calendar.getInstance(), "yyyy-MM-dd HH:mm:ss");
    }
    public void simpanData(){
        String idBarang = txtIdBarang.getText();
        String namaBarang = txtNamaBarang.getText();
        String jenisBarang = null;
        if(rdJangkaPanjang.isSelected()){
            jenisBarang = "Barang Jangka Panjang";
        } else if(rdJangkaPendek.isSelected()){
            jenisBarang = "Barang Jangka Pendek";
        }
        String tgl_masuk = getTanggal();
        String status = txtStatus.getText();
        String lokasi = txtLokasi.getText();
                try {
                    Statement stmt = koneksi.createStatement();
                    String query = "INSERT INTO barang_masuk(id_barang, nama_barang, jenis_barang, tgl_masuk, kondisi, lokasi) " +
                        "VALUES('"+idBarang+"','"+namaBarang+"','"+jenisBarang+"','"+tgl_masuk+"','"+status+"','"+lokasi+"')";
                    System.out.println(query);
            
                    int berhasil = stmt.executeUpdate(query);
                    if (berhasil == 1){
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
                    }else{
                    JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan");
                    }
                } catch (SQLException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Database");
                }
    }
    
    public void editData(){
        String idBarang = txtIdBarang.getText();
        String namaBarang = txtNamaBarang.getText();
        String jenisBarang = null;
        if(rdJangkaPanjang.isSelected()){
            jenisBarang = "Barang Jangka Panjang";
        } else if(rdJangkaPendek.isSelected()){
            jenisBarang = "Barang Jangka Pendek";
        }
        String tgl_masuk = getTanggal();
        String status = txtStatus.getText();
        String lokasi = txtLokasi.getText();
        try {
            Statement stmt = koneksi.createStatement();
            String query = "UPDATE barang_masuk SET nama_barang = '" + namaBarang +"', jenis_barang = '"+ jenisBarang+ "', kondisi = '"+status+"',lokasi = '"+lokasi+"' WHERE id_barang = '"+idBarang+"'";
            System.out.println(query);
            
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1){
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            }else{
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada Database");
        }
    }
    public void showData(String idBarang) {
        try {
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM barang_masuk WHERE id_barang ='"+ idBarang +"'";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            txtIdBarang.setText(rs.getString("id_barang"));
            txtNamaBarang.setText(rs.getString("nama_barang"));
            if ("Barang Jangka Panjang".equals(rs.getString("jenis_barang"))) {
                rdJangkaPanjang.setSelected(TRUE);
            }else if ("Barang Jangka Pendek".equals(rs.getString("jenis_barang"))) {
                rdJangkaPendek.setSelected(TRUE);
            }
            txtStatus.setText(rs.getString("kondisi"));
            txtLokasi.setText(rs.getString("lokasi"));
        } catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan di Query");
        }
    }
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
            java.util.logging.Logger.getLogger(ManageDataStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDataStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDataStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDataStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageDataStok().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnJenis;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel lblIDBarang;
    private javax.swing.JLabel lblJenisBarang;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblNamaBarang;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JRadioButton rdJangkaPanjang;
    private javax.swing.JRadioButton rdJangkaPendek;
    private javax.swing.JTextField txtIdBarang;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
