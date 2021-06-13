/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureapp;

/**
 *
 * @author davidromero
 */
public class MainFrame extends javax.swing.JFrame {
     static int userId;
    /**
     * Creates new form MainFrame
     * @param Id
     */
    public MainFrame(int Id) {
        userId = Id;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        engine = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        beta = new javax.swing.JLabel();
        SalirBtn = new javax.swing.JButton();
        userSettingsBtn = new javax.swing.JButton();
        Body = new javax.swing.JPanel();
        temp1 = new javax.swing.JLabel();
        temp1Motor = new javax.swing.JLabel();
        temp2 = new javax.swing.JLabel();
        temp3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FooterLeft = new javax.swing.JPanel();
        CoolerLabel = new javax.swing.JLabel();
        HeaterLabel = new javax.swing.JLabel();
        enfriandoLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        FooterRight = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        minTempTF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        engine.setBackground(new java.awt.Color(255, 255, 255));
        engine.setFont(new java.awt.Font("SansSerif", 0, 47)); // NOI18N
        engine.setText("engine");
        Header.add(engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 79, -1, -1));

        temp.setBackground(new java.awt.Color(255, 255, 255));
        temp.setFont(new java.awt.Font("SansSerif", 1, 47)); // NOI18N
        temp.setText("temp");
        Header.add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 79, -1, -1));

        beta.setBackground(new java.awt.Color(252, 202, 62));
        beta.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        beta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beta.setText("beta");
        beta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        beta.setOpaque(true);
        Header.add(beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 49, 67, 30));

        SalirBtn.setBackground(new java.awt.Color(252, 202, 62));
        SalirBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        SalirBtn.setText("salir.");
        SalirBtn.setBorder(null);
        SalirBtn.setBorderPainted(false);
        SalirBtn.setOpaque(true);
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });
        Header.add(SalirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1194, 65, 180, 65));

        userSettingsBtn.setBackground(new java.awt.Color(0, 0, 0));
        userSettingsBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        userSettingsBtn.setForeground(new java.awt.Color(255, 255, 255));
        userSettingsBtn.setText("usuarios.");
        userSettingsBtn.setBorder(null);
        userSettingsBtn.setOpaque(true);
        userSettingsBtn.setPreferredSize(new java.awt.Dimension(180, 60));
        userSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSettingsBtnActionPerformed(evt);
            }
        });
        Header.add(userSettingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1474, 160));

        Body.setBackground(new java.awt.Color(196, 196, 196));

        temp1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp1.setText("Temperatura");

        temp1Motor.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp1Motor.setText("del motor");

        temp2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp2.setText("Lecturas");

        temp3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp3.setText("de temperatura");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Temperatura");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("promedio de la");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("última hora");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Temperatura");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("promedio desde");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("arranque");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        jLabel7.setText("110C");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        jLabel8.setText("11.3K");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        jLabel9.setText("110C");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        jLabel10.setText("110C");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temp1Motor)
                            .addComponent(temp1))
                        .addGap(200, 200, 200)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temp3)
                            .addComponent(temp2)))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(115, 115, 115))))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(temp1)
                                .addGap(0, 0, 0)
                                .addComponent(temp1Motor)
                                .addGap(48, 48, 48)))
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(temp2)
                        .addGap(0, 0, 0)
                        .addComponent(temp3)
                        .addContainerGap(210, Short.MAX_VALUE))))
        );

        jPanel1.add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, -1));

        FooterLeft.setBackground(new java.awt.Color(226, 226, 226));

        CoolerLabel.setBackground(new java.awt.Color(252, 202, 62));
        CoolerLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        CoolerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CoolerLabel.setText("COOLER");
        CoolerLabel.setOpaque(true);

        HeaterLabel.setBackground(new java.awt.Color(252, 202, 62));
        HeaterLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        HeaterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaterLabel.setText("HEATER");
        HeaterLabel.setOpaque(true);

        enfriandoLabel.setBackground(new java.awt.Color(0, 140, 241));
        enfriandoLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        enfriandoLabel.setForeground(new java.awt.Color(255, 255, 255));
        enfriandoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enfriandoLabel.setText("Enfriando");
        enfriandoLabel.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("En espera");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout FooterLeftLayout = new javax.swing.GroupLayout(FooterLeft);
        FooterLeft.setLayout(FooterLeftLayout);
        FooterLeftLayout.setHorizontalGroup(
            FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLeftLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeaterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoolerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGroup(FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enfriandoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        FooterLeftLayout.setVerticalGroup(
            FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLeftLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enfriandoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoolerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(FooterLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeaterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(FooterLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, 340));

        FooterRight.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel12.setText("MAX TEMPERATURA");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(252, 202, 62));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jButton1.setText("enviar.");
        jButton1.setBorder(null);
        jButton1.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel13.setText("MIN TEMPERATURA");

        minTempTF.setFont(new java.awt.Font("SansSerif", 0, 25)); // NOI18N
        minTempTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(252, 202, 62));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jButton2.setText("enviar.");
        jButton2.setBorder(null);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterRightLayout = new javax.swing.GroupLayout(FooterRight);
        FooterRight.setLayout(FooterRightLayout);
        FooterRightLayout.setHorizontalGroup(
            FooterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterRightLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(FooterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FooterRightLayout.createSequentialGroup()
                        .addComponent(minTempTF, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13)
                    .addGroup(FooterRightLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FooterRightLayout.setVerticalGroup(
            FooterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterRightLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FooterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FooterRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minTempTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel1.add(FooterRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 460, 832, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
     extiFrame ef = new extiFrame();
     ef.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSettingsBtnActionPerformed
        userReportFrame us = new userReportFrame(userId);
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userSettingsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               MainFrame mf = new MainFrame(userId);
                       mf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel CoolerLabel;
    private javax.swing.JPanel FooterLeft;
    private javax.swing.JPanel FooterRight;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel HeaterLabel;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JLabel beta;
    private javax.swing.JLabel enfriandoLabel;
    private javax.swing.JLabel engine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField minTempTF;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel temp1;
    private javax.swing.JLabel temp1Motor;
    private javax.swing.JLabel temp2;
    private javax.swing.JLabel temp3;
    private javax.swing.JButton userSettingsBtn;
    // End of variables declaration//GEN-END:variables
}
