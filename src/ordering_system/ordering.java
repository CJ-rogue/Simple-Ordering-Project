/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering_system;

import javax.swing.JOptionPane;

public class ordering extends javax.swing.JFrame {

    float burger = (float) 9.45;
    float fries = (float) 5.85;
    
    public ordering() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 167, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 48)); // NOI18N
        jLabel2.setText("Wac Donalds");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(248, 167, 167));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Wac Burger - $9.45");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Wac Fries - $5.85");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 30, 20));

        jButton1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton1.setText("Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 120, 30));

        jCheckBox1.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox1.setText("Cheesy Fries");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox2.setText("Cheese Burger");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox3.setText("Ham Burger");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox4.setText("Chicken Burger");
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jCheckBox5.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox5.setText("Garlic Fries");
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jCheckBox6.setBackground(new java.awt.Color(248, 167, 167));
        jCheckBox6.setText("BBQ Fries");
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jTextField4.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("0");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 30, 20));

        jTextField5.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("0");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 30, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, 10));

        jTextField6.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 30, 20));

        jTextField7.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 30, 20));

        jTextField8.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("0");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 30, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabel8.setText("Quantity");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 10));

        jButton2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 470, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordering_system/34.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        float total = 0;
        if (jCheckBox2.isSelected())
        {
            float subTotal; 
            subTotal = (float) (burger * Double.parseDouble(jTextField4.getText()));
            total =+ subTotal;
        }
        if (jCheckBox3.isSelected())
        {
            float subTotal; 
            subTotal = (float) (burger * Double.parseDouble(jTextField5.getText()));
            total =+ subTotal;
        }
        if (jCheckBox4.isSelected())
        {
            float subTotal; 
            subTotal = (float) (burger * Double.parseDouble(jTextField2.getText()));
            total =+ subTotal;
        }
        if (jCheckBox5.isSelected())
        {
            float subTotal; 
            subTotal = (float) (fries * Double.parseDouble(jTextField6.getText()));
            total =+ subTotal;
        }
        if (jCheckBox6.isSelected())
        {
            float subTotal; 
            subTotal = (float) (fries * Double.parseDouble(jTextField7.getText()));
            total =+ subTotal;
        }
        if (jCheckBox1.isSelected())
        {
            float subTotal; 
            subTotal = (float) (fries * Double.parseDouble(jTextField8.getText()));
            total =+ subTotal;
        }
        JOptionPane.showMessageDialog(null, "Total Amount: $"+ (String.format("%.2f", total)) + "\nPlease wait for 5 minutes in the counter. \nThank you!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add yor handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField6.setText("0");
        jTextField5.setText("0");
        jTextField4.setText("0");
        jTextField2.setText("0");
        
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox5.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
