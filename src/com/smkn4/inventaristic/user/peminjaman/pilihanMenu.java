/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn4.inventaristic.user.peminjaman;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author COMPUTER
 */
public class pilihanMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    
    public pilihanMenu() {
        initComponents();
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

        pinjam = new javax.swing.JPanel();
        pinjamBarang = new javax.swing.JLabel();
        minta = new javax.swing.JPanel();
        mintaBarang = new javax.swing.JLabel();
        lblNotif1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pinjam.setBackground(new java.awt.Color(153, 153, 153));
        pinjam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamMouseClicked(evt);
            }
        });

        pinjamBarang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pinjamBarang.setText("Peminjaman");

        javax.swing.GroupLayout pinjamLayout = new javax.swing.GroupLayout(pinjam);
        pinjam.setLayout(pinjamLayout);
        pinjamLayout.setHorizontalGroup(
            pinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pinjamLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(pinjamBarang)
                .addContainerGap())
        );
        pinjamLayout.setVerticalGroup(
            pinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pinjamLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(pinjamBarang)
                .addGap(41, 41, 41))
        );

        minta.setBackground(new java.awt.Color(153, 153, 153));
        minta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mintaMouseClicked(evt);
            }
        });

        mintaBarang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mintaBarang.setText("Permintaan");

        javax.swing.GroupLayout mintaLayout = new javax.swing.GroupLayout(minta);
        minta.setLayout(mintaLayout);
        mintaLayout.setHorizontalGroup(
            mintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mintaLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(mintaBarang)
                .addContainerGap())
        );
        mintaLayout.setVerticalGroup(
            mintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mintaLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(mintaBarang)
                .addGap(41, 41, 41))
        );

        lblNotif1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNotif1.setText("Pilih Metode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(minta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblNotif1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblNotif1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamMouseClicked
        scanKartu scan = new scanKartu();
        scan.act = "pinjam";
        scan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pinjamMouseClicked

    private void mintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mintaMouseClicked
        scanKartu scan = new scanKartu();
        scan.act = "minta";
        scan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mintaMouseClicked

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
            java.util.logging.Logger.getLogger(pilihanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilihanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilihanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilihanMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pilihanMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNotif1;
    private javax.swing.JPanel minta;
    private javax.swing.JLabel mintaBarang;
    private javax.swing.JPanel pinjam;
    private javax.swing.JLabel pinjamBarang;
    // End of variables declaration//GEN-END:variables
}
