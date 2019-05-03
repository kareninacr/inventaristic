/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smkn4.inventaristic;

import com.smkn4.inventaristic.admin.pengajuan.Pengajuan;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import com.smkn4.inventaristic.admin.siswa.DataUser;
/**
 *
 * @author Audi
 */
public class Home extends javax.swing.JFrame {

    int x, y;

    /**
     * Creates new form Main
     */
    public Home() {
        initComponents();
        setOpacity((float) 0.0);
    }

    public void close() {
        for (double i = 0.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (Exception e) {

            }
        }
//        this.setVisible(false);
//        System.exit(0);
//        this.setState(Home.ICONIFIED);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
//        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
//            String val = i + "";
//            float f = Float.valueOf(val);
//            this.setOpacity(f);
//            try {
//                Thread.sleep(50);
//            } catch (Exception e) {
//
//            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameDrag = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        DataUser = new javax.swing.JLabel();
        Pengajuan = new javax.swing.JLabel();
        Bantuan = new javax.swing.JLabel();
        InputData = new javax.swing.JLabel();
        DataBarang = new javax.swing.JLabel();
        RekapData = new javax.swing.JLabel();
        DataPeminjam = new javax.swing.JLabel();
        StatusBarang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manajemen Inventaris");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        getContentPane().add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 20));

        searchField.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 0, 102));
        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setBorder(null);
        searchField.setCaretColor(new java.awt.Color(150, 0, 150));
        searchField.setOpaque(false);
        searchField.setSelectionColor(new java.awt.Color(150, 0, 150));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 210, 20));

        DataUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataUserMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DataUserMouseReleased(evt);
            }
        });
        getContentPane().add(DataUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 40));

        Pengajuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pengajuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PengajuanMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PengajuanMouseReleased(evt);
            }
        });
        getContentPane().add(Pengajuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 40));
        getContentPane().add(Bantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 210));
        getContentPane().add(InputData, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, 200));
        getContentPane().add(DataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 170, 200));
        getContentPane().add(RekapData, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 170, 210));
        getContentPane().add(DataPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 170, 200));
        getContentPane().add(StatusBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 170, 210));

        jPanel1.setBackground(new java.awt.Color(228, 228, 228));

        exit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        minimize.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("_");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 100, 80));

        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smkn4/inventaristic/assets/menua.jpg"))); // NOI18N
        getContentPane().add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        int mousex = evt.getXOnScreen();
        int mousey = evt.getYOnScreen();

        this.setLocation(mousex - x, mousey - y);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void DataUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserMouseReleased

    }//GEN-LAST:event_DataUserMouseReleased

    private void PengajuanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengajuanMouseReleased

    }//GEN-LAST:event_PengajuanMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        for (double i = 0.0; i >= 0.0; i = i - 0.1) {
//            String val = i + "";
//            float f = Float.valueOf(val);
//            this.setOpacity(f);
//            try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//
//            }
//        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void DataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataUserMouseClicked
        close();
        new DataUser().setVisible(true);
    }//GEN-LAST:event_DataUserMouseClicked

    private void PengajuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PengajuanMouseClicked
        close();
        new Pengajuan().setVisible(true);
    }//GEN-LAST:event_PengajuanMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        close();
    }//GEN-LAST:event_exitMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bantuan;
    private javax.swing.JLabel DataBarang;
    private javax.swing.JLabel DataPeminjam;
    private javax.swing.JLabel DataUser;
    private javax.swing.JLabel InputData;
    private javax.swing.JLabel Main;
    private javax.swing.JLabel Pengajuan;
    private javax.swing.JLabel RekapData;
    private javax.swing.JLabel StatusBarang;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}

















