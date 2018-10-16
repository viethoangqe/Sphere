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


public class ModifyOrder extends javax.swing.JFrame {

    /**
     * Creates new form NewOrder
     */
    private String accType;
    private String timeInForce;

    private JFrame windows;
    public static String mDPrice = "";

    public ModifyOrder() {
        initComponents();
        //this.setUndecorated(true);
        //this.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        windows = this;
        ClassLoader classLoader = getClass().getClassLoader();
        ImageIcon img = new ImageIcon(classLoader.getResource("imgs/icon2.png"));

        windows.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);

        if (OUCHMain.printBytesOuch.isSelected() == true) {
            newTokenField.setText(OuchYesBytes.token + 1 + "");
        } else {
            newTokenField.setText(OuchNoBytes.token + 1 + "");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        newTokenField = new javax.swing.JTextField();
        orderTokenField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Order");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Order Token:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("New Token:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Quantity:");

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(51, 51, 51));
        priceLabel.setText("Price:");

        priceField.setBackground(new java.awt.Color(242, 242, 242));
        priceField.setForeground(new java.awt.Color(38, 38, 38));
        priceField.setText("0");
        priceField.setToolTipText("1-9999999999");
        priceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceFieldKeyTyped(evt);
            }
        });

        quantityField.setBackground(new java.awt.Color(242, 242, 242));
        quantityField.setForeground(new java.awt.Color(38, 38, 38));
        quantityField.setText("0");
        quantityField.setToolTipText("1-9999999999");
        quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityFieldKeyTyped(evt);
            }
        });

        newTokenField.setEditable(false);
        newTokenField.setBackground(new java.awt.Color(242, 242, 242));
        newTokenField.setForeground(new java.awt.Color(38, 38, 38));
        newTokenField.setToolTipText("1-9999999999");

        orderTokenField.setEditable(false);
        orderTokenField.setBackground(new java.awt.Color(242, 242, 242));
        orderTokenField.setForeground(new java.awt.Color(38, 38, 38));
        orderTokenField.setToolTipText("1-9999999999");
        orderTokenField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTokenFieldActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(38, 38, 38));
        jButton1.setText("Send");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(priceLabel)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newTokenField)
                    .addComponent(orderTokenField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(quantityField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderTokenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newTokenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                OUCHSoupBinTCPYesBytes.ModifyOrder((orderTokenField.getText()), newTokenField.getText(), quantityField.getText(), priceField.getText());
            } else {
                OUCHSoupBinTCPNoBytes.ModifyOrder((orderTokenField.getText()), newTokenField.getText(), quantityField.getText(), priceField.getText());
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

    private void quantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
        if (quantityField.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_quantityFieldKeyTyped

    private void priceFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceFieldKeyTyped
        // TODO add your handling code here:
        char teclaPulsada = evt.getKeyChar();
        if (!Character.isDigit(teclaPulsada)) {
            evt.consume();
        }
        if (priceField.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_priceFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newTokenField;
    public javax.swing.JTextField orderTokenField;
    public javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    public javax.swing.JTextField quantityField;
    // End of variables declaration//GEN-END:variables
}