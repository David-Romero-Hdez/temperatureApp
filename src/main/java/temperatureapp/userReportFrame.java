/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author davidromero
 */
public class userReportFrame extends javax.swing.JFrame {

    static int[] c;
    static int userId;

    /**
     * Creates new form userReportFrame
     */
    public userReportFrame(int Id, int[] col) {
        c = col;
        userId = Id;
        initComponents();
        updateColors(c);

        int reportedCount = 0;
        int registeredCount = 0;

        Connection con;
        MyConnection mcon = new MyConnection();
        con = mcon.returnConnection();
        String sql = "SELECT * FROM public.users";
        Statement stm;
        try {
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                registeredCount++;
                if (rs.getBoolean("report")) {
                    reportedCount++;
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        reportCountLbl.setText(reportedCount + "");
        regCountLbl.setText(registeredCount + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        usersTLabel = new javax.swing.JLabel();
        userTLabel = new javax.swing.JLabel();
        regCountLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        reportCountLbl = new javax.swing.JLabel();
        chartBtn = new javax.swing.JButton();
        footer2Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reportTextField = new javax.swing.JTextField();
        undoReportTextField = new javax.swing.JTextField();
        reportBtn = new javax.swing.JButton();
        undoReportBtn = new javax.swing.JButton();
        footer1Panel = new javax.swing.JPanel();
        agendaBtn = new javax.swing.JButton();
        nuevoBtn = new javax.swing.JButton();
        graphicBtn1 = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        engineLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        beta = new javax.swing.JLabel();
        SalirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(196, 196, 196));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTLabel.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        usersTLabel.setText("Usuarios");
        mainPanel.add(usersTLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        userTLabel.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        userTLabel.setText("Registrados");
        mainPanel.add(userTLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        regCountLbl.setFont(new java.awt.Font("SansSerif", 0, 95)); // NOI18N
        regCountLbl.setText("0");
        regCountLbl.setToolTipText("");
        mainPanel.add(regCountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setText("Usuarios");
        mainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel11.setText("Reportados");
        mainPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        reportCountLbl.setFont(new java.awt.Font("SansSerif", 0, 95)); // NOI18N
        reportCountLbl.setText("0");
        mainPanel.add(reportCountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        chartBtn.setBackground(new java.awt.Color(0, 0, 0));
        chartBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        chartBtn.setText("Grafica de Usuarios");
        chartBtn.setBorderPainted(false);
        chartBtn.setPreferredSize(new java.awt.Dimension(330, 60));
        chartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartBtnActionPerformed(evt);
            }
        });
        mainPanel.add(chartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 380, -1));

        backgroundPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1280, 340));

        footer2Panel.setBackground(new java.awt.Color(255, 255, 255));
        footer2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setText("REPORTAR USUARIO CON ID");
        footer2Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setText("ELIMINAR REPORTE CON ID");
        footer2Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 165, -1, -1));

        reportTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        reportTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reportTextField.setPreferredSize(new java.awt.Dimension(380, 50));
        reportTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportTextFieldActionPerformed(evt);
            }
        });
        footer2Panel.add(reportTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, -1, -1));

        undoReportTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        undoReportTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        undoReportTextField.setPreferredSize(new java.awt.Dimension(380, 50));
        undoReportTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoReportTextFieldActionPerformed(evt);
            }
        });
        footer2Panel.add(undoReportTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        reportBtn.setBackground(new java.awt.Color(252, 202, 62));
        reportBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        reportBtn.setText("enviar.");
        reportBtn.setBorder(null);
        reportBtn.setBorderPainted(false);
        reportBtn.setPreferredSize(new java.awt.Dimension(180, 50));
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        footer2Panel.add(reportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 85, -1, -1));

        undoReportBtn.setBackground(new java.awt.Color(252, 202, 62));
        undoReportBtn.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        undoReportBtn.setText("enviar.");
        undoReportBtn.setBorder(null);
        undoReportBtn.setBorderPainted(false);
        undoReportBtn.setPreferredSize(new java.awt.Dimension(180, 50));
        undoReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoReportBtnActionPerformed(evt);
            }
        });
        footer2Panel.add(undoReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        backgroundPanel.add(footer2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 640, 300));

        footer1Panel.setBackground(new java.awt.Color(226, 226, 226));
        footer1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agendaBtn.setBackground(new java.awt.Color(0, 0, 0));
        agendaBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        agendaBtn.setText("Agenda");
        agendaBtn.setBorderPainted(false);
        agendaBtn.setPreferredSize(new java.awt.Dimension(180, 60));
        footer1Panel.add(agendaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        nuevoBtn.setBackground(new java.awt.Color(10, 146, 255));
        nuevoBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        nuevoBtn.setText("Nuevo");
        nuevoBtn.setBorderPainted(false);
        nuevoBtn.setPreferredSize(new java.awt.Dimension(180, 60));
        footer1Panel.add(nuevoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        graphicBtn1.setBackground(new java.awt.Color(0, 0, 0));
        graphicBtn1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        graphicBtn1.setText("ajustes usuario");
        graphicBtn1.setBorderPainted(false);
        graphicBtn1.setPreferredSize(new java.awt.Dimension(330, 60));
        graphicBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicBtn1ActionPerformed(evt);
            }
        });
        footer1Panel.add(graphicBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 380, -1));

        backgroundPanel.add(footer1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 640, 300));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        engineLabel.setFont(new java.awt.Font("SansSerif", 0, 47)); // NOI18N
        engineLabel.setText("engine");
        headerPanel.add(engineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        tempLabel.setFont(new java.awt.Font("Lucida Grande", 1, 47)); // NOI18N
        tempLabel.setText("temp");
        headerPanel.add(tempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        beta.setBackground(new java.awt.Color(252, 202, 62));
        beta.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        beta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beta.setText("beta");
        beta.setOpaque(true);
        beta.setPreferredSize(new java.awt.Dimension(70, 30));
        headerPanel.add(beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        SalirBtn.setBackground(new java.awt.Color(252, 202, 62));
        SalirBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        SalirBtn.setText("salir.");
        SalirBtn.setBorder(null);
        SalirBtn.setBorderPainted(false);
        SalirBtn.setPreferredSize(new java.awt.Dimension(175, 60));
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });
        headerPanel.add(SalirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, -1, -1));

        backgroundPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        extiFrame ef = new extiFrame(c);
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void reportTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportTextFieldActionPerformed

    private void undoReportTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoReportTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undoReportTextFieldActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        int id = Integer.parseInt(reportTextField.getText());
        Connection con;
        try {
            MyConnection mcon = new MyConnection();
            con = mcon.returnConnection();
            String sql = "UPDATE public.users SET report=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setBoolean(1, true);
            stm.setInt(2, id);
            stm.executeUpdate();
            con.close();
            reportTextField.setText("");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_reportBtnActionPerformed

    private void undoReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoReportBtnActionPerformed
        int id = Integer.parseInt(undoReportTextField.getText());
        Connection con;
        try {
            MyConnection mcon = new MyConnection();
            con = mcon.returnConnection();
            String sql = "UPDATE public.users SET report=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setBoolean(1, false);
            stm.setInt(2, id);
            stm.executeUpdate();
            con.close();
            undoReportTextField.setText("");
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_undoReportBtnActionPerformed

    private void chartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartBtnActionPerformed
        ChartUsers us = new ChartUsers();
        us.setVisible(true);
    }//GEN-LAST:event_chartBtnActionPerformed

    private void graphicBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicBtn1ActionPerformed
        userSettings us = new userSettings(userId, c);
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_graphicBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(userReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userReportFrame(userId, c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton agendaBtn;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel beta;
    private javax.swing.JButton chartBtn;
    private javax.swing.JLabel engineLabel;
    private javax.swing.JPanel footer1Panel;
    private javax.swing.JPanel footer2Panel;
    private javax.swing.JButton graphicBtn1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JLabel regCountLbl;
    private javax.swing.JButton reportBtn;
    private javax.swing.JLabel reportCountLbl;
    private javax.swing.JTextField reportTextField;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JButton undoReportBtn;
    private javax.swing.JTextField undoReportTextField;
    private javax.swing.JLabel userTLabel;
    private javax.swing.JLabel usersTLabel;
    // End of variables declaration//GEN-END:variables
private void updateColors(int[] c) {
        java.awt.Color color = new java.awt.Color(c[0], c[1], c[2]);
        reportBtn.setBackground(color);
        undoReportBtn.setBackground(color);
        SalirBtn.setBackground(color);
        agendaBtn.setBackground(color);
        nuevoBtn.setBackground(color);
        chartBtn.setBackground(color);
        graphicBtn1.setBackground(color);
        beta.setBackground(color);
    }
}
