/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healy;

/**
 *
 * @author User
 */
public class SignUpClient extends javax.swing.JFrame {

    /**
     * Creates new form SignUpClient
     */
    public SignUpClient() {
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

        jPanel4 = new javax.swing.JPanel();
        containerBody1 = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        containerHead1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(720, 60));

        jPanel4.setBackground(new java.awt.Color(13, 76, 115));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(394, 852));
        jPanel4.setMinimumSize(new java.awt.Dimension(394, 852));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(394, 852));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerBody1.setBackground(new java.awt.Color(13, 76, 115));
        containerBody1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputEmail.setBorder(null);
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });
        containerBody1.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 260, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputEmail.png"))); // NOI18N
        containerBody1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 340, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email Address");
        containerBody1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        inputPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputPassword.setBorder(null);
        containerBody1.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Password");
        containerBody1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputPassword.png"))); // NOI18N
        containerBody1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, 60));

        inputUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputUsername.setBorder(null);
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        containerBody1.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");
        containerBody1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputUsername.png"))); // NOI18N
        containerBody1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 340, 60));

        buttonLogin.setBackground(new java.awt.Color(13, 76, 115));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(144, 224, 239));
        buttonLogin.setText("Login");
        buttonLogin.setBorder(null);
        buttonLogin.setBorderPainted(false);
        buttonLogin.setContentAreaFilled(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
        });
        containerBody1.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Already have an account?");
        containerBody1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel4.add(containerBody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 410, 350));

        containerHead1.setBackground(new java.awt.Color(13, 76, 115));
        containerHead1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerSign.png"))); // NOI18N
        containerHead1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerCreate.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        containerHead1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 410, 50));

        jPanel4.add(containerHead1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 150));

        buttonRegister.setBackground(new java.awt.Color(13, 76, 115));
        buttonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonRegister.png"))); // NOI18N
        buttonRegister.setBorder(null);
        buttonRegister.setBorderPainted(false);
        buttonRegister.setContentAreaFilled(false);
        buttonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseClicked(evt);
            }
        });
        jPanel4.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 340, 60));

        jButton6.setBackground(new java.awt.Color(13, 76, 115));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(242, 211, 153));
        jButton6.setText("Terms & Conditions");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 140, -1));

        jButton7.setBackground(new java.awt.Color(13, 76, 115));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(242, 211, 153));
        jButton7.setText("Privacy Policy");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 110, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/google.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 90, 50));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/apple.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 90, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 211, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Or register using social media");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 410, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSocialMedia.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 410, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegisterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        LoginClient loginP = new LoginClient();
        loginP.show();
        dispose();
    }//GEN-LAST:event_buttonLoginMouseClicked

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
        try{
            String username = inputUsername.getText();
            String email = inputEmail.getText();
            String password = inputPassword.getText();
            Patient client = new Patient();
            client.register(username, email, password);
            int success = client.saveData(username, email, password);
            if(success == 1){
                LoginClient loginCl = new LoginClient();
                loginCl.show();
                dispose();
            }else if(success == -1){
                
            }
        }catch(Exception ev){
            
        }
    }//GEN-LAST:event_buttonRegisterMouseClicked

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPanel containerBody1;
    private javax.swing.JPanel containerHead1;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}