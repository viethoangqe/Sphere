/*
 * Copyright (C) 2018 Juan J. Martínez
 * 
 * All rights reserved. This complete software or any portion thereof
 * can be used as reference but may not be reproduced in any manner 
 * whatsoever without the express written permission of the owner.
 * 
 * The purpose of this is to be consulted and used as a referece of 
 * functionallyty.
 * 
 * Developed in Mexico City
 * First version, 2018
 *
 */

/**
 *
 * @author Juan J. Martínez
 * @email juanjmtzs@gmail.com
 * @phone +52-1-55-1247-8044
 * @linkedin https://www.linkedin.com/in/juanjmtzs/
 *
 */

package OUCH;

import Decoder.OuchNoBytes;
import Decoder.OuchYesBytes;
import Handler.OUCHSoupBinTCPNoBytes;
import Handler.OUCHSoupBinTCPYesBytes;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CancelOrder extends javax.swing.JFrame {

    /**
     * Creates new form NewOrder
     */
    private String accType;
    private String timeInForce;
    private JFrame windows;
    public static String mDPrice = "";

    public CancelOrder() {
        initComponents();
        //this.setUndecorated(true);
        //this.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        windows = this;
        ClassLoader classLoader = getClass().getClassLoader();
        ImageIcon img = new ImageIcon(classLoader.getResource("imgs/icon2.png"));

        windows.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);

        if (OUCHMain.printBytesOuch.isSelected() == true) {
            orderTokenField.setText(OuchYesBytes.token + 1 + "");
        } else {
            orderTokenField.setText(OuchNoBytes.token + 1 + "");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        orderTokenField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Order");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Order Token:");

        orderTokenField.setEditable(false);
        orderTokenField.setBackground(new java.awt.Color(242, 242, 242));
        orderTokenField.setForeground(new java.awt.Color(38, 38, 38));
        orderTokenField.setToolTipText("1-9999999999");
        orderTokenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTokenFieldActionPerformed(evt);
            }
        });
        orderTokenField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orderTokenFieldKeyTyped(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(38, 38, 38));
        jButton1.setText("Cancel Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderTokenField)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderTokenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderTokenFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTokenFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderTokenFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            // TODO add your handling code here:
            if (OUCHMain.printBytesOuch.isSelected() == true) {
                OUCHSoupBinTCPYesBytes.CancelOrder(orderTokenField.getText());
            } else {
                OUCHSoupBinTCPNoBytes.CancelOrder(orderTokenField.getText());
            }

            this.dispose();
        } catch (IOException e) {
            //System.out.print("Exception sending logoff packet: " + e);
            String messageError = "Socket closed" + "\n" + e;

            // create a jframe
            JFrame error = new JFrame();

            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(error, messageError, "Information", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderTokenFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderTokenFieldKeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
        if (orderTokenField.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_orderTokenFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField orderTokenField;
    // End of variables declaration//GEN-END:variables
}
