/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healy;

/**
 *
 * @author User
 */
public class SignUpDoctor extends javax.swing.JFrame {

    /**
     * Creates new form SignUpDoctor
     */
    public SignUpDoctor() {
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

        jPanel3 = new javax.swing.JPanel();
        containerBody = new javax.swing.JPanel();
        inputEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        containerHead = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(720, 60));

        jPanel3.setBackground(new java.awt.Color(13, 76, 115));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(394, 852));
        jPanel3.setMinimumSize(new java.awt.Dimension(394, 852));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(394, 852));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerBody.setBackground(new java.awt.Color(13, 76, 115));
        containerBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputEmail.setBorder(null);
        containerBody.add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 260, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputEmail.png"))); // NOI18N
        containerBody.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 340, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email Address");
        containerBody.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        inputPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputPassword.setBorder(null);
        containerBody.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        containerBody.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputPassword.png"))); // NOI18N
        containerBody.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, 60));

        inputUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        inputUsername.setBorder(null);
        containerBody.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Username");
        containerBody.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/inputUsername.png"))); // NOI18N
        containerBody.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 340, 60));

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
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        containerBody.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already have an account?");
        containerBody.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jPanel3.add(containerBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 410, 350));

        containerHead.setBackground(new java.awt.Color(13, 76, 115));
        containerHead.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerSign.png"))); // NOI18N
        containerHead.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerCreate.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        containerHead.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 410, 50));

        jPanel3.add(containerHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 150));

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
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(buttonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 330, 60));

        jButton1.setBackground(new java.awt.Color(13, 76, 115));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 211, 153));
        jButton1.setText("Terms & Conditions");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 140, -1));

        jButton3.setBackground(new java.awt.Color(13, 76, 115));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 211, 153));
        jButton3.setText("Privacy Policy");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 110, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/google.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 720, 90, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/apple.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 720, 90, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 211, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Or register using social media");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 410, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonSocialMedia.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 410, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        LoginDoctor loginD = new LoginDoctor();
        loginD.show();
        dispose();        
    }//GEN-LAST:event_buttonLoginMouseClicked

    private void buttonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseClicked
        try{
            String username = inputUsername.getText();
            String email = inputEmail.getText();
            String password = inputPassword.getText();
            Doctor counselor = new Doctor();
            counselor.register(username, email, password);
            LoginDoctor loginD = new LoginDoctor();
            loginD.show();
            dispose();
        }catch(Exception ev){
            
        }
    }//GEN-LAST:event_buttonRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(SignUpDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPanel containerBody;
    private javax.swing.JPanel containerHead;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
