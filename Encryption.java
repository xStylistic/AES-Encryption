
/** 
 * June 10th, 2021
 * ICS3U1
 * AES Encryption/Decryption Software
 * This program can encrypt and decrypt text using the AES method
 * @author Bonny Chen
 */

public class Encryption extends javax.swing.JFrame {
    
    // AESAlgorithm is set to the variable aesAlgo
    AESAlgorithm aesAlgo;
    
    // Byte key value array
    private static final byte[] keyValue = new byte[] {'J', 'a', 'v', 'a', 'I', 's', 'F', 'u', 'n', 'T', 'o', 'L', 'e', 'a', 'r', 'n'};

    public Encryption() {
        
        initComponents();
        
        // Adds keyValue to AESAlgorithm
        aesAlgo = new AESAlgorithm(keyValue);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblTopSecret = new javax.swing.JLabel();
        lblSoftwareName = new javax.swing.JLabel();
        lblEnterD = new javax.swing.JLabel();
        btnEncrypt = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        txtEncrypt = new javax.swing.JTextField();
        txtDecrypt = new javax.swing.JTextField();
        lblEnterD1 = new javax.swing.JLabel();
        lblInstr2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblInstr1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 0, 0));

        panelHeader.setBackground(new java.awt.Color(0, 255, 0));

        lblTopSecret.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTopSecret.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopSecret.setText("TOP SECRET");

        lblSoftwareName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSoftwareName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoftwareName.setText("ENCRYPTION AND DECRYPTION SOFTWARE");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblTopSecret)
                .addContainerGap(134, Short.MAX_VALUE))
            .addComponent(lblSoftwareName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopSecret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSoftwareName)
                .addContainerGap())
        );

        lblEnterD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEnterD.setForeground(new java.awt.Color(0, 255, 0));
        lblEnterD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterD.setText("Enter text:");

        btnEncrypt.setBackground(new java.awt.Color(0, 255, 0));
        btnEncrypt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEncrypt.setText("ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnDecrypt.setBackground(new java.awt.Color(0, 255, 0));
        btnDecrypt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDecrypt.setText("DECRYPT");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        txtEncrypt.setBackground(new java.awt.Color(0, 0, 0));
        txtEncrypt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtEncrypt.setForeground(new java.awt.Color(255, 255, 255));
        txtEncrypt.setText("Enter text and click 'ENCRYPT' to display the encrypted text");
        txtEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncryptActionPerformed(evt);
            }
        });

        txtDecrypt.setBackground(new java.awt.Color(0, 0, 0));
        txtDecrypt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtDecrypt.setForeground(new java.awt.Color(255, 255, 255));
        txtDecrypt.setText("Enter encrypted text and click 'DECRYPT' to display the decrypted text");
        txtDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecryptActionPerformed(evt);
            }
        });

        lblEnterD1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEnterD1.setForeground(new java.awt.Color(0, 255, 0));
        lblEnterD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterD1.setText("Enter encrypted text:");

        lblInstr2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstr2.setForeground(new java.awt.Color(255, 255, 255));
        lblInstr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstr2.setText("Keep clicking the button to decrypt your message");

        btnReset.setBackground(new java.awt.Color(0, 255, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 255, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblInstr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInstr1.setForeground(new java.awt.Color(255, 255, 255));
        lblInstr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstr1.setText("You can encrypt your message as many times as you like");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnterD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEncrypt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstr2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterD1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstr1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblEnterD)
                .addGap(10, 10, 10)
                .addComponent(txtEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblInstr1)
                .addGap(10, 10, 10)
                .addComponent(lblEnterD1)
                .addGap(10, 10, 10)
                .addComponent(txtDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblInstr2)
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncryptActionPerformed

    }//GEN-LAST:event_txtEncryptActionPerformed

    private void txtDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecryptActionPerformed

    }//GEN-LAST:event_txtDecryptActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
      
        // Exception
        try {
            
            String plainText = aesAlgo.encrypt(txtEncrypt.getText()); // Get text from user 
            String encryptedText = aesAlgo.encrypt(plainText); // Encrypts text from the code in AESAlgorithm.java
            txtEncrypt.setText(encryptedText); // Outputs the encrypted text

        } catch (Exception e) { // Catch any errors 
            
        }

    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        
        // Exception
        try {
           
            String encryptedText = txtDecrypt.getText(); // Get the encrypted text from user
            String plainText = aesAlgo.decrypt(encryptedText); // Decrypts text from the code in AESAlgorithm.java
            txtDecrypt.setText(plainText); // Outputs the decrypted text
            
        } catch (Exception e) {
        
        }     

    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        // Reset textboxes
        txtEncrypt.setText("");
        txtDecrypt.setText("");

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        // Exits program
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblEnterD;
    private javax.swing.JLabel lblEnterD1;
    private javax.swing.JLabel lblInstr1;
    private javax.swing.JLabel lblInstr2;
    private javax.swing.JLabel lblSoftwareName;
    private javax.swing.JLabel lblTopSecret;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtDecrypt;
    private javax.swing.JTextField txtEncrypt;
    // End of variables declaration//GEN-END:variables
}
