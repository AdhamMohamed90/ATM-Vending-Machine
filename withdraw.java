/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm.machine;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author omarTarek
 */
public class withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public withdraw() {
        connection Class = new connection();
        Login log = new Login();
        ResultSet rs = null;
        try {
            initComponents();
            rs = Class.selectUser(log.user1, log.password1);
            show.setText(rs.getString(3));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 290));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("عودة");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 310, 100, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("4000");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 190, 80, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("100");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 90, 80, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("   50");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 90, 80, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("200");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 90, 80, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("2000");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 190, 80, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("500");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 90, 80, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1000");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 190, 80, 40);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("سحب مبلغ اخر");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(410, 310, 100, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("3000");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 190, 80, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("جنية مصري");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 10, 80, 30);

        show.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(show);
        show.setBounds(100, 10, 120, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("سحب مبلغ مالي");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(200, 20, 170, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/machine/with.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 370);

        setSize(new java.awt.Dimension(542, 391));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
        menu w = new menu();
        w.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=4000){
            JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));
            Class.updateTable((rs.getInt(3) - 4000), log.user1);
            Class.insertTable(log.user1, "Withdraw", 4000.0);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=100){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 100), log.user1);
            Class.insertTable(log.user1, "Withdraw", 100);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=50){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 50), log.user1);
            Class.insertTable(log.user1, "Withdraw", 50);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=200){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 200), log.user1);
            Class.insertTable(log.user1, "Withdraw", 200);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=2000){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 2000), log.user1);
            Class.insertTable(log.user1, "Withdraw", 2000);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=500){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 500), log.user1);
            Class.insertTable(log.user1, "Withdraw", 500);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=1000){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 1000), log.user1);
            Class.insertTable(log.user1, "Withdraw", 1000);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Login log = new Login();
        connection Class = new connection();
        ResultSet rs = null;
        try {
            rs = Class.selectUser(log.user1, log.password1);
            if(rs.getInt(3)>=3000){
JOptionPane.showMessageDialog(null, "تم سحب المبلغ بنجاح", "تمت العمليه بنجاح", 0, new ImageIcon("OIP_2.png"));            Class.updateTable((rs.getInt(3) - 3000), log.user1);
            Class.insertTable(log.user1, "Withdraw", 3000);
            int x = Class.cheekClose();
            if (x == 1) {
                new menu().setVisible(true);
                setVisible(false);
            }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "حدث خطأ", 0, new ImageIcon("R.png"));
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        setVisible(false);
        new AnotherAmount().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
