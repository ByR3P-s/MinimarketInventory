package minimarketinventory;

import javax.swing.JOptionPane;

public class InventoryFrame extends javax.swing.JFrame {
    
    public InventoryFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        CatalogButton = new javax.swing.JButton();
        SalesButton = new javax.swing.JButton();
        ReportsButton = new javax.swing.JButton();
        ApplesButton = new javax.swing.JButton();
        ButterButton = new javax.swing.JButton();
        EggsButton = new javax.swing.JButton();
        MilkButton = new javax.swing.JButton();
        OranJuButton = new javax.swing.JButton();
        BreadButton = new javax.swing.JButton();
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 750));

        jPanel1.setBackground(new java.awt.Color(59, 190, 178));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 750));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        CatalogButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        CatalogButton.setText("Catalog");
        CatalogButton.setActionCommand("InventoryButton");
        CatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogButtonActionPerformed(evt);
            }
        });

        SalesButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        SalesButton.setText("Sales");
        SalesButton.setActionCommand("SalesButton");
        SalesButton.setPreferredSize(new java.awt.Dimension(82, 24));
        SalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesButtonActionPerformed(evt);
            }
        });

        ReportsButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ReportsButton.setText("Reports");
        ReportsButton.setActionCommand("ReportsButton");
        ReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsButtonActionPerformed(evt);
            }
        });

        ApplesButton.setText("Add to Cart");
        ApplesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplesButtonActionPerformed(evt);
            }
        });

        ButterButton.setText("Add to Cart");
        ButterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButterButtonActionPerformed(evt);
            }
        });

        EggsButton.setText("Add to Cart");
        EggsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EggsButtonActionPerformed(evt);
            }
        });

        MilkButton.setText("Add to Cart");
        MilkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkButtonActionPerformed(evt);
            }
        });

        OranJuButton.setText("Add to Cart");
        OranJuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OranJuButtonActionPerformed(evt);
            }
        });

        BreadButton.setText("Add to Cart");
        BreadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreadButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apples.jpeg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Butter.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eggs.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrangeJuice.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Milk.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.jpeg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apples");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Milk");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Butter");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Orange ");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Eggs");

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bread");

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Juice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CatalogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(SalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(ReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EggsButton)
                            .addComponent(ButterButton)
                            .addComponent(ApplesButton)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(OranJuButton)
                                .addComponent(BreadButton))
                            .addComponent(jLabel8)
                            .addComponent(MilkButton)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(222, 222, 222))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CatalogButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(60, 60, 60)
                        .addComponent(ApplesButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(60, 60, 60)
                        .addComponent(MilkButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OranJuButton)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButterButton)
                        .addGap(25, 25, 25))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EggsButton)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BreadButton)
                                .addGap(100, 100, 100))))))
        );

        CatalogButton.getAccessibleContext().setAccessibleName("CatalogButton");
        ApplesButton.getAccessibleContext().setAccessibleName("P123Button");
        ButterButton.getAccessibleContext().setAccessibleName("P124Button");
        EggsButton.getAccessibleContext().setAccessibleName("P125Button");
        MilkButton.getAccessibleContext().setAccessibleName("P126Button");
        OranJuButton.getAccessibleContext().setAccessibleName("P127Button");
        BreadButton.getAccessibleContext().setAccessibleName("P128Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Soon");
    }//GEN-LAST:event_SalesButtonActionPerformed

    private void CatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogButtonActionPerformed
        JOptionPane.showMessageDialog(this, "You are here already");
    }//GEN-LAST:event_CatalogButtonActionPerformed

    private void ButterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButterButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Mount");
        if (isNumeric(input)) {
            String productCode = "p124";
            double amount = Double.parseDouble(input);
            // Guardar el monto para el producto Butter (p124)
            // ...
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }//GEN-LAST:event_ButterButtonActionPerformed

    private void ApplesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplesButtonActionPerformed
        String appleType = JOptionPane.showInputDialog(this, "Green Or Red");
        String productCode;
        if (appleType != null) {
            if (appleType.equalsIgnoreCase("Green")) {
                productCode = "p123";
            } else if (appleType.equalsIgnoreCase("Red")) {
                productCode = "p123";
            } else {
                JOptionPane.showMessageDialog(this, "Invalid apple type. Please try again.");
                return;
            }
            String input = JOptionPane.showInputDialog(this, "Mount");
            if (isNumeric(input)) {
                double amount = Double.parseDouble(input);
                // Guardar el monto para el producto Apples (p123)
                // ...
            } else {
                JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
            }
        }
    }//GEN-LAST:event_ApplesButtonActionPerformed

    private void ReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Soon");
    }//GEN-LAST:event_ReportsButtonActionPerformed

    private void EggsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EggsButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Mount of Cartons");
        if (isNumeric(input)) {
            String productCode = "p125";
            double amount = Double.parseDouble(input);
            // Guardar el monto para el producto Eggs (p125)
            // ...
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }//GEN-LAST:event_EggsButtonActionPerformed

    private void MilkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Mount");
        if (isNumeric(input)) {
            String productCode = "p126";
            double amount = Double.parseDouble(input);
            // Guardar el monto para el producto Milk (p126)
            // ...
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }//GEN-LAST:event_MilkButtonActionPerformed

    private void OranJuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OranJuButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Mount");
        if (isNumeric(input)) {
            String productCode = "p127";
            double amount = Double.parseDouble(input);
            // Guardar el monto para el producto Orange Juice (p127)
            // ...
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }//GEN-LAST:event_OranJuButtonActionPerformed

    private void BreadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreadButtonActionPerformed
        String input = JOptionPane.showInputDialog(this, "Mount");
        if (isNumeric(input)) {
            String productCode = "p128";
            double amount = Double.parseDouble(input);
            // Guardar el monto para el producto Bread (p128)
            // ...
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input. Please try again.");
        }
    }//GEN-LAST:event_BreadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplesButton;
    private javax.swing.JButton BreadButton;
    private javax.swing.JButton ButterButton;
    private javax.swing.JButton CatalogButton;
    private javax.swing.JButton EggsButton;
    private javax.swing.JButton MilkButton;
    private javax.swing.JButton OranJuButton;
    private javax.swing.JButton ReportsButton;
    private javax.swing.JButton SalesButton;
    private javax.swing.JDialog jDialog2;
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
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String input) {
        try {
        Double.parseDouble(input);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }

    }
}
