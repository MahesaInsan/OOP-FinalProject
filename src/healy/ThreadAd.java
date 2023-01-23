package healy;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class ThreadAd extends javax.swing.JFrame {
    private static int id, idThread;
    
    /**
     * Creates new form ThreadAd
     */
    public ThreadAd(int id) {
        initComponents();
        
        JPanel[] threadBox = new JPanel[10];
        JLabel[] threadTitle = new JLabel[10];
        JButton[] threadDelete = new JButton[10];
        body.setSize(400, 560);
        int i = 1, y = 10;
        
        try {
            String url = "jdbc:mysql://localhost:3306/healyDB?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String pass = "pass";

            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("[debug]BEFORE CHECKING");
            Statement stmt = con.createStatement();
            String Query = "SELECT * FROM forum";
            ResultSet rs = stmt.executeQuery(Query);
            System.out.println("[debug]AFTER CHECKING");

            while (rs.next()) {
                int threadId = ((Number)rs.getObject("forum_id")).intValue();
                
                threadBox[i] = new JPanel();
                threadBox[i].setBounds(20, y, 360, 50);
                threadBox[i].setBackground(new Color(0, 119, 182));
                threadBox[i].setVisible(true);
                System.out.println("[debug]AFTER thread box");
                
                
                threadTitle[i] = new JLabel();
                threadTitle[i].setBounds(30, y+5, 265, 40);
                threadTitle[i].setForeground(Color.WHITE);
                threadTitle[i].setFont(new Font("Segoe UI", 1, 20));
                String title = rs.getString("thread_title");
                threadTitle[i].setText(title);
                threadTitle[i].setVisible(true);
                System.out.println("[debug]AFTER counsel title");
                
                
                threadDelete[i] = new JButton();
                threadDelete[i].setBounds(275, y+5, 100, 40);
                threadDelete[i].setBackground(new Color(0, 119, 182));
                threadDelete[i].setForeground(Color.RED);
                threadDelete[i].setFont(new Font("Segoe UI", 1, 16));
                threadDelete[i].setText("DELETE");
                threadDelete[i].addActionListener(e->deleteThread(threadId));
                threadDelete[i].setVisible(true);
                
                System.out.println("[debug]PRINT" + i);
                System.out.println(title);

                body.add(threadTitle[i]);
                body.add(threadDelete[i]);
                body.add(threadBox[i]);
                body.setVisible(true);

                i += 1;
                y += 60;
            }

        } catch (SQLException ex) {
            System.out.println("[debug]ERROR PRINT");
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

        popupDelete = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonContinue = new javax.swing.JButton();
        footer = new javax.swing.JPanel();
        buttonForum = new javax.swing.JButton();
        buttonLogOut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        popupDelete.setBackground(new java.awt.Color(13, 76, 115));
        popupDelete.setLocation(new java.awt.Point(735, 320));
        popupDelete.setResizable(false);
        popupDelete.setSize(new java.awt.Dimension(380, 250));
        popupDelete.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(13, 76, 115));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DELETE THIS THREAD");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 380, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(144, 224, 239));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("are you sure?");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 40));

        buttonContinue.setBackground(new java.awt.Color(13, 76, 115));
        buttonContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonContinue.png"))); // NOI18N
        buttonContinue.setBorder(null);
        buttonContinue.setBorderPainted(false);
        buttonContinue.setContentAreaFilled(false);
        buttonContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonContinueMouseClicked(evt);
            }
        });
        buttonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContinueActionPerformed(evt);
            }
        });
        jPanel5.add(buttonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 260, 60));

        popupDelete.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(720, 60));
        setMinimumSize(new java.awt.Dimension(400, 820));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footer.setBackground(new java.awt.Color(13, 76, 115));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonForum.setBackground(new java.awt.Color(144, 224, 239));
        buttonForum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonForum-select.png"))); // NOI18N
        buttonForum.setBorder(null);
        buttonForum.setBorderPainted(false);
        buttonForum.setContentAreaFilled(false);
        buttonForum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonForum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonForumMouseClicked(evt);
            }
        });
        footer.add(buttonForum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        buttonLogOut.setBackground(new java.awt.Color(144, 224, 239));
        buttonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonLogOutAdmin.png"))); // NOI18N
        buttonLogOut.setBorder(null);
        buttonLogOut.setBorderPainted(false);
        buttonLogOut.setContentAreaFilled(false);
        buttonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogOutMouseClicked(evt);
            }
        });
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });
        footer.add(buttonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/footerWide.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        footer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 120));

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 400, 130));

        body.setBackground(new java.awt.Color(13, 76, 115));
        body.setAutoscrolls(true);
        body.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, 520));

        header.setBackground(new java.awt.Color(13, 76, 115));
        header.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/healy-logo.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(232, 188));
        jLabel3.setMinimumSize(new java.awt.Dimension(232, 188));
        jLabel3.setPreferredSize(new java.awt.Dimension(232, 188));
        header.add(jLabel3);
        jLabel3.setBounds(200, 10, 200, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerForum.png"))); // NOI18N
        header.add(jLabel5);
        jLabel5.setBounds(0, -10, 190, 140);

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteThread(int id){
        this.idThread = id;
        popupDelete.show();
    }
    
    private void buttonForumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonForumMouseClicked
        ThreadAd thread = new ThreadAd(id);
        thread.show();
        dispose();
    }//GEN-LAST:event_buttonForumMouseClicked

    private void buttonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogOutMouseClicked
        Index idx = new Index();
        idx.show();
        dispose();
    }//GEN-LAST:event_buttonLogOutMouseClicked

    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogOutActionPerformed

    private void buttonContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContinueMouseClicked
        Thread thread = new Thread();
        int result = thread.deleteThread(idThread);
        if(result == 1){
            System.out.println("THREAD DELETED");
            popupDelete.dispose();
            dispose();
            ThreadAd threadAd = new ThreadAd(id);
            threadAd.show();
            dispose();
        }else System.out.println("ERROR DELETE");
        
    }//GEN-LAST:event_buttonContinueMouseClicked

    private void buttonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonContinueActionPerformed

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
            java.util.logging.Logger.getLogger(ThreadAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadAd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadAd(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonForum;
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JDialog popupDelete;
    // End of variables declaration//GEN-END:variables
}