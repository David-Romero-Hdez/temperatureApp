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
import javax.swing.JOptionPane;

/**
 *
 * @author davidromero
 */
public class userSettings extends javax.swing.JFrame {

    static int[] c;
    static int userId;

    /**
     * Creates new form userSettings
     */
    public userSettings(int Id, int[] col) {
        userId = Id;
        c = col;
        initComponents();
        updateColors(c);
//        LoginFrame log = new LoginFrame();
        Connection con;
        MyConnection mcon = new MyConnection();
        con = mcon.returnConnection();
        String sql = "SELECT * FROM public.users where id=" + userId;
        Statement stm;
        try {
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                System.out.println("in populating");
                nameTextField.setText(rs.getString("nombres"));
                lastNameTextField.setText(rs.getString("apellidos"));
                userTextField.setText(rs.getString("username"));
                passwordField.setText(rs.getString("clave"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        engineLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        betaLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        userTextField = new javax.swing.JTextField();
        userTitleLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        sendButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        engineLabel.setFont(new java.awt.Font("SansSerif", 0, 47)); // NOI18N
        engineLabel.setText("engine");
        jPanel1.add(engineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        tempLabel.setFont(new java.awt.Font("SansSerif", 1, 47)); // NOI18N
        tempLabel.setText("temp");
        jPanel1.add(tempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        betaLabel.setBackground(new java.awt.Color(252, 202, 62));
        betaLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        betaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        betaLabel.setText("beta");
        betaLabel.setOpaque(true);
        betaLabel.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel1.add(betaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        nameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTextField.setPreferredSize(new java.awt.Dimension(380, 50));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        lastNameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lastNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastNameTextField.setPreferredSize(new java.awt.Dimension(380, 50));
        jPanel1.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        userTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        userTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userTextField.setPreferredSize(new java.awt.Dimension(380, 50));
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        userTitleLabel.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        userTitleLabel.setText("cambiar informaci??n de usuario");
        jPanel1.add(userTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 380, 50));

        sendButton.setBackground(new java.awt.Color(252, 202, 62));
        sendButton.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        sendButton.setText("enviar.");
        sendButton.setBorder(null);
        sendButton.setOpaque(true);
        sendButton.setPreferredSize(new java.awt.Dimension(180, 50));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setText("NOMBRES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel2.setText("APELLIDOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setText("CLAVE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(238, 0, 46));
        deleteBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        deleteBtn.setText("Eliminar");
        deleteBtn.setBorder(null);
        deleteBtn.setOpaque(true);
        deleteBtn.setPreferredSize(new java.awt.Dimension(180, 50));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        Connection con;
        try {
            MyConnection mcon = new MyConnection();
            con = mcon.returnConnection();
            String sql = "UPDATE public.users SET username= ?, clave=? , nombres=?, apellidos=? WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, userTextField.getText());
            stm.setString(2, passwordField.getText());
            stm.setString(3, nameTextField.getText());
            stm.setString(4, lastNameTextField.getText());
            stm.setInt(5, userId);
            stm.executeUpdate();
            con.close();
            System.out.println("updated");
            new userReportFrame(userId, c).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Connection con;
        try {
            MyConnection mcon = new MyConnection();
            con = mcon.returnConnection();
            String sql = "DELETE from public.users WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, userId);
            stm.execute();
            con.close();
            extiFrame ef = new extiFrame(c);
            ef.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userSettings(userId, c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel betaLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel engineLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel userTitleLabel;
    // End of variables declaration//GEN-END:variables
private void updateColors(int[] c) {
        java.awt.Color color = new java.awt.Color(c[0], c[1], c[2]);
        betaLabel.setBackground(color);
        sendButton.setBackground(color);
        deleteBtn.setBackground(color);
    }
}
