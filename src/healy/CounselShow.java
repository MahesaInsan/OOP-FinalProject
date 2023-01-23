/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healy;

/**
 *
 * @author User
 */
public class CounselShow extends javax.swing.JFrame {
    private static int id, idCounsel;
    
    /**
     * Creates new form NewJFrame
     */
    public CounselShow(int idUser, int idCounsel) {
        System.out.println(idCounsel);
        initComponents();
        this.id = idUser;
        this.idCounsel = idCounsel;
        Patient client = new Patient();
        client.getData(idUser);
        Counsel counsel = new Counsel();
        
        userName.setText(client.username);
        problem.setText(counsel.getProblem(idCounsel));
        int result = counsel.getStatus(idCounsel);
        if(result == 1){
            doctorName.setText(counsel.getDoctorName(idCounsel));
            solution.setText(counsel.getSolution(idCounsel));
        }else if(result == -1){
            doctorName.setText("NULL");
            solution.setText("NULL");
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

        footer = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonDiary = new javax.swing.JButton();
        buttonClinic = new javax.swing.JButton();
        buttonForum = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        doctorName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        problem = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        solution = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(720, 60));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        footer.setBackground(new java.awt.Color(13, 76, 115));
        footer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHome.setBackground(new java.awt.Color(144, 224, 239));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonHome.png"))); // NOI18N
        buttonHome.setBorder(null);
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeMouseClicked(evt);
            }
        });
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        footer.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        buttonDiary.setBackground(new java.awt.Color(144, 224, 239));
        buttonDiary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonDiary.png"))); // NOI18N
        buttonDiary.setBorder(null);
        buttonDiary.setBorderPainted(false);
        buttonDiary.setContentAreaFilled(false);
        buttonDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDiaryMouseClicked(evt);
            }
        });
        footer.add(buttonDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 80, -1));

        buttonClinic.setBackground(new java.awt.Color(144, 224, 239));
        buttonClinic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonClinic-Select.png"))); // NOI18N
        buttonClinic.setBorder(null);
        buttonClinic.setBorderPainted(false);
        buttonClinic.setContentAreaFilled(false);
        buttonClinic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClinic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClinicMouseClicked(evt);
            }
        });
        buttonClinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClinicActionPerformed(evt);
            }
        });
        footer.add(buttonClinic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 80, -1));

        buttonForum.setBackground(new java.awt.Color(144, 224, 239));
        buttonForum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/buttonForum.png"))); // NOI18N
        buttonForum.setBorder(null);
        buttonForum.setBorderPainted(false);
        buttonForum.setContentAreaFilled(false);
        buttonForum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonForum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonForumMouseClicked(evt);
            }
        });
        footer.add(buttonForum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/footerWide.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        footer.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 420, -1));

        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 400, 120));

        body.setBackground(new java.awt.Color(13, 76, 115));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("userName");
        body.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 260, 50));

        doctorName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        doctorName.setForeground(new java.awt.Color(255, 255, 255));
        doctorName.setText("jLabel6");
        body.add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 336, 260, 50));

        jScrollPane1.setBackground(new java.awt.Color(0, 119, 182));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        problem.setEditable(false);
        problem.setBackground(new java.awt.Color(0, 119, 182));
        problem.setColumns(20);
        problem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        problem.setForeground(new java.awt.Color(255, 255, 255));
        problem.setRows(5);
        problem.setText("jlabel");
        problem.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(problem);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 180));

        jScrollPane2.setBackground(new java.awt.Color(0, 119, 182));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        solution.setEditable(false);
        solution.setBackground(new java.awt.Color(0, 119, 182));
        solution.setColumns(20);
        solution.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        solution.setForeground(new java.awt.Color(255, 255, 255));
        solution.setRows(5);
        solution.setText("jlabel");
        solution.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(solution);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 340, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/comment.png"))); // NOI18N
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/backgroundCounselShow.png"))); // NOI18N
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 590));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, 590));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healy/asset/headerClinic.png"))); // NOI18N
        header.add(jLabel5);
        jLabel5.setBounds(0, 0, 190, 140);

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonClinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClinicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClinicActionPerformed

    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        HomeCl homeCl = new HomeCl(id);
        homeCl.show();
        dispose();
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void buttonClinicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClinicMouseClicked
        ClinicMenuCl clinic = new ClinicMenuCl(id);
        clinic.show();
        dispose();
    }//GEN-LAST:event_buttonClinicMouseClicked

    private void buttonForumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonForumMouseClicked
        ForumMenuCl forum = new ForumMenuCl(id);
        forum.show();
        dispose();
    }//GEN-LAST:event_buttonForumMouseClicked

    private void buttonDiaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiaryMouseClicked
        DiaryMenuCl diaryMenu = new DiaryMenuCl(id);
        diaryMenu.show();
        dispose();
    }//GEN-LAST:event_buttonDiaryMouseClicked

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
            java.util.logging.Logger.getLogger(CounselShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounselShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounselShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounselShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounselShow(id, idCounsel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton buttonClinic;
    private javax.swing.JButton buttonDiary;
    private javax.swing.JButton buttonForum;
    private javax.swing.JButton buttonHome;
    private javax.swing.JLabel doctorName;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea problem;
    private javax.swing.JTextArea solution;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}