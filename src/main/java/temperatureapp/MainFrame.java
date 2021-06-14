/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureapp;

import java.awt.Color;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import org.eclipse.paho.client.mqttv3.*;

/**
 *
 * @author davidromero
 */
public class MainFrame extends javax.swing.JFrame implements MqttCallback {

    ArrayList readings = new ArrayList<Integer>();
    static int userId;
    static Colors c = new Colors();

    /**
     * Creates new form MainFrame
     *
     * @param Id
     */
    public void publish(MqttAsyncClient sampleClient, String topic, String content, int qos) {
        System.out.println(topic + "Publishing message: " + content);
        MqttMessage message = new MqttMessage(content.getBytes());
        message.setQos(qos);
        try {
            sampleClient.publish(topic, message);
        } catch (Exception me) {
            if (me instanceof MqttException) {
                System.out.println("reason " + ((MqttException) me).getReasonCode());
            }
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }
    }

    public MainFrame(int Id, Colors c) {
        userId = Id;
        initComponents();

        updateColors();

        int qos = 2;
        String broker = "tcp://broker.hivemq.com";
        String clientId = "tempAppClient";

        try {
            MqttAsyncClient sampleClient = new MqttAsyncClient(broker, clientId);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);

            System.out.println("Connecting to broker: " + broker);
            IMqttToken token = sampleClient.connect(connOpts);
            System.out.println("Connected");
            token.waitForCompletion();
            sampleClient.setCallback(this);

            sampleClient.subscribe("tempApp/#", qos);
            System.out.println("Subscribed");
            publish(sampleClient, "tempApp/motorState", "on", qos);
            publish(sampleClient, "tempApp/minTemp", "20", qos);
            publish(sampleClient, "tempApp/maxTemp", "30", qos);

        } catch (Exception me) {
            if (me instanceof MqttException) {
                System.out.println("reason " + ((MqttException) me).getReasonCode());
            }
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }

    }

    public void connectionLost(Throwable arg0) {
        System.err.println("connection lost");

    }

    public void deliveryComplete(IMqttDeliveryToken arg0) {
        System.err.println("delivery complete");
    }

    public void messageArrived(String topic, MqttMessage message) throws Exception {
        String payload = new String(message.getPayload());
        System.out.println("topic: " + topic);
        System.out.println("message: " + payload);

        switch (topic) {
            case "tempApp/motorState":
                handleMotorState(payload);
                break;
            case "tempApp/coolerState":
                handleCoolerState(payload);
                break;
            case "tempApp/heaterState":
                handleHeaterState(payload);
                break;
            case "tempApp/maxTemp":
                handleMaxTempState(payload);
                break;
            case "tempApp/minTemp":
                handleMinTempState(payload);
                break;
            case "tempApp/currenReading":
                handleCurrenReading(payload);
                break;
        }
    }

    private void handleMotorState(String payload) {
        switch (payload) {
            case "on": {
                this.motorLbl.setText("Encendido");
                this.motorLbl.setBackground(Color.decode("#00CA51"));
                break;
            }
            case "off": {
                this.motorLbl.setText("Apagado");
                this.motorLbl.setBackground(Color.decode("#000000"));
                break;
            }
        }
    }

    private void handleCoolerState(String payload) {
        switch (payload) {
            case "on": {
                this.enfriandoLabel.setText("Enfriando");
                break;
            }
            case "off": {
                this.enfriandoLabel.setText("En espera");
                this.motorLbl.setBackground(Color.decode("#000000"));
                break;
            }
        }
    }

    private void handleHeaterState(String payload) {
        switch (payload) {
            case "on": {
                this.heaterLbl.setText("Calentando");
                break;
            }
            case "off": {
                this.heaterLbl.setText("En espera");
                this.motorLbl.setBackground(Color.decode("#000000"));
                break;
            }
        }
    }

    private void handleMaxTempState(String payload) {
        this.maxLbl.setText(payload + "C");
    }

    private void handleMinTempState(String payload) {
        this.minLbl.setText(payload + "C");
    }

    private void handleCurrenReading(String payload) {

        int reading;
        try {
            reading = Integer.parseInt(payload);
        } catch (NumberFormatException e) {
            reading = 0;
        }

        readings.add(reading);
        
        IntSummaryStatistics stats = readings.stream()
                                     .mapToInt((x) -> (int)x)
                                     .summaryStatistics();
        
        
        tempLbl.setText(reading + "C");
        readingCountLbl.setText(stats.getCount()+ "");
        avgTempLbl.setText(stats.getAverage()+ "C");
        avgTempAll.setText(stats.getMax()+ "C");
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
        tempLbl = new javax.swing.JLabel();
        readingCountLbl = new javax.swing.JLabel();
        avgTempLbl = new javax.swing.JLabel();
        avgTempAll = new javax.swing.JLabel();
        FooterLeft = new javax.swing.JPanel();
        CoolerLabel = new javax.swing.JLabel();
        HeaterLabel = new javax.swing.JLabel();
        enfriandoLabel = new javax.swing.JLabel();
        heaterLbl = new javax.swing.JLabel();
        motorLbl = new javax.swing.JLabel();
        MotorLabel = new javax.swing.JLabel();
        FooterRight = new javax.swing.JPanel();
        minLbl = new javax.swing.JLabel();
        maxTmpTF = new javax.swing.JTextField();
        sendMaxBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        minTempTF = new javax.swing.JTextField();
        sendMinBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        maxLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });
        Header.add(SalirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 180, 60));

        userSettingsBtn.setBackground(new java.awt.Color(0, 0, 0));
        userSettingsBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        userSettingsBtn.setForeground(new java.awt.Color(255, 255, 255));
        userSettingsBtn.setText("usuarios.");
        userSettingsBtn.setBorder(null);
        userSettingsBtn.setPreferredSize(new java.awt.Dimension(180, 60));
        userSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSettingsBtnActionPerformed(evt);
            }
        });
        Header.add(userSettingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, 60));

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 160));

        Body.setBackground(new java.awt.Color(196, 196, 196));
        Body.setPreferredSize(new java.awt.Dimension(1280, 303));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        temp1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp1.setText("Temperatura");
        Body.add(temp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        temp1Motor.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp1Motor.setText("del motor");
        Body.add(temp1Motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        temp2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp2.setText("Lecturas");
        Body.add(temp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        temp3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        temp3.setText("de temperatura");
        Body.add(temp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Temperatura");
        Body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("promedio de la");
        Body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("última hora");
        Body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Temperatura");
        Body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("promedio desde");
        Body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("arranque");
        Body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 100, -1));

        tempLbl.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        tempLbl.setText("0C");
        Body.add(tempLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        readingCountLbl.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        readingCountLbl.setText("0");
        Body.add(readingCountLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 262, -1));

        avgTempLbl.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        avgTempLbl.setText("0C");
        Body.add(avgTempLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 252, -1));

        avgTempAll.setFont(new java.awt.Font("SansSerif", 0, 90)); // NOI18N
        avgTempAll.setText("0C");
        Body.add(avgTempAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, 134));

        jPanel1.add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, -1));

        FooterLeft.setBackground(new java.awt.Color(226, 226, 226));
        FooterLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoolerLabel.setBackground(new java.awt.Color(252, 202, 62));
        CoolerLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        CoolerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CoolerLabel.setText("COOLER");
        CoolerLabel.setOpaque(true);
        FooterLeft.add(CoolerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 260, 60));

        HeaterLabel.setBackground(new java.awt.Color(252, 202, 62));
        HeaterLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        HeaterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaterLabel.setText("HEATER");
        HeaterLabel.setOpaque(true);
        FooterLeft.add(HeaterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 60));

        enfriandoLabel.setBackground(new java.awt.Color(0, 0, 0));
        enfriandoLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        enfriandoLabel.setForeground(new java.awt.Color(255, 255, 255));
        enfriandoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enfriandoLabel.setText("cargando...");
        enfriandoLabel.setOpaque(true);
        FooterLeft.add(enfriandoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 281, 60));

        heaterLbl.setBackground(new java.awt.Color(0, 0, 0));
        heaterLbl.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        heaterLbl.setForeground(new java.awt.Color(255, 255, 255));
        heaterLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heaterLbl.setText("cargando...");
        heaterLbl.setOpaque(true);
        FooterLeft.add(heaterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 281, 60));

        motorLbl.setBackground(new java.awt.Color(0, 0, 0));
        motorLbl.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        motorLbl.setForeground(new java.awt.Color(255, 255, 255));
        motorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motorLbl.setText(" cargando...");
        motorLbl.setOpaque(true);
        FooterLeft.add(motorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 281, 60));

        MotorLabel.setBackground(new java.awt.Color(252, 202, 62));
        MotorLabel.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        MotorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MotorLabel.setText("MOTOR");
        MotorLabel.setOpaque(true);
        FooterLeft.add(MotorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, 60));

        jPanel1.add(FooterLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 640, 340));

        FooterRight.setBackground(new java.awt.Color(255, 255, 255));
        FooterRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minLbl.setBackground(new java.awt.Color(255, 255, 255));
        minLbl.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        minLbl.setText("CARGANDO...");
        FooterRight.add(minLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        maxTmpTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FooterRight.add(maxTmpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 290, 50));

        sendMaxBtn.setBackground(new java.awt.Color(252, 202, 62));
        sendMaxBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        sendMaxBtn.setText("enviar.");
        sendMaxBtn.setBorder(null);
        FooterRight.add(sendMaxBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 180, 50));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel13.setText("MIN TEMPERATURA:");
        FooterRight.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        minTempTF.setFont(new java.awt.Font("SansSerif", 0, 25)); // NOI18N
        minTempTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FooterRight.add(minTempTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, 50));

        sendMinBtn.setBackground(new java.awt.Color(252, 202, 62));
        sendMinBtn.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        sendMinBtn.setText("enviar.");
        sendMinBtn.setBorder(null);
        sendMinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMinBtnActionPerformed(evt);
            }
        });
        FooterRight.add(sendMinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 180, 50));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel14.setText("MAX TEMPERATURA:");
        FooterRight.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        maxLbl.setBackground(new java.awt.Color(255, 255, 255));
        maxLbl.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        maxLbl.setText("CARGANDO...");
        FooterRight.add(maxLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jPanel1.add(FooterRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 640, 340));

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
        extiFrame ef = new extiFrame(c);
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void sendMinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMinBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMinBtnActionPerformed

    private void userSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSettingsBtnActionPerformed
        userReportFrame us = new userReportFrame(userId, c);
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
                MainFrame mf = new MainFrame(userId, c);
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
    private javax.swing.JLabel MotorLabel;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JLabel avgTempAll;
    private javax.swing.JLabel avgTempLbl;
    private javax.swing.JLabel beta;
    private javax.swing.JLabel enfriandoLabel;
    private javax.swing.JLabel engine;
    private javax.swing.JLabel heaterLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maxLbl;
    private javax.swing.JTextField maxTmpTF;
    private javax.swing.JLabel minLbl;
    private javax.swing.JTextField minTempTF;
    private javax.swing.JLabel motorLbl;
    private javax.swing.JLabel readingCountLbl;
    private javax.swing.JButton sendMaxBtn;
    private javax.swing.JButton sendMinBtn;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel temp1;
    private javax.swing.JLabel temp1Motor;
    private javax.swing.JLabel temp2;
    private javax.swing.JLabel temp3;
    private javax.swing.JLabel tempLbl;
    private javax.swing.JButton userSettingsBtn;
    // End of variables declaration//GEN-END:variables

    private void updateColors() {
        java.awt.Color color = new java.awt.Color(c.getColors()[0], c.getColors()[1], c.getColors()[2]);
        sendMaxBtn.setBackground(color);
        sendMinBtn.setBackground(color);
        SalirBtn.setBackground(color);
        CoolerLabel.setBackground(color);
        HeaterLabel.setBackground(color);
        MotorLabel.setBackground(color);
    }
}
