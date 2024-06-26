/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_detai1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        this.setUndecorated(true);
        initComponents();
        background.setComponentZOrder(menu, 0);
        menu.setComponentZOrder(NGUOIDUNG, 0);
        menu.setComponentZOrder(LUACHONCUNG, 0);
        menu.setComponentZOrder(THOAT, 0);
        background.setComponentZOrder(NGUOIDUNG, 0);
        background.setComponentZOrder(LUACHONCUNG, 0);
        background.setComponentZOrder(THOAT, 0);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        menu = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        NGUOIDUNG = new javax.swing.JLabel();
        LUACHONCUNG = new javax.swing.JLabel();
        THOAT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/background.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 510));
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/menu.png"))); // NOI18N
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 48, 290, 400));
        menu.getAccessibleContext().setAccessibleParent(this);

        jLayeredPane2.setBackground(new java.awt.Color(255, 0, 255));
        jPanel1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 0, 0));

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        jPanel1.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1099, 93, -1, -1));

        NGUOIDUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/NGUOIDUNG.png"))); // NOI18N
        NGUOIDUNG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NGUOIDUNGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NGUOIDUNGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NGUOIDUNGMouseExited(evt);
            }
        });
        jPanel1.add(NGUOIDUNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 240, -1));

        LUACHONCUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/LUACHONCUNG.png"))); // NOI18N
        LUACHONCUNG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LUACHONCUNGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LUACHONCUNGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LUACHONCUNGMouseExited(evt);
            }
        });
        jPanel1.add(LUACHONCUNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 240, -1));

        THOAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/THOAT.png"))); // NOI18N
        THOAT.setText("jLabel1");
        THOAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                THOATMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THOATMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                THOATMouseExited(evt);
            }
        });
        jPanel1.add(THOAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // nguoi dung click

    private void NGUOIDUNGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NGUOIDUNGMouseClicked
        NGUOIDUNG userForm = new NGUOIDUNG();
        userForm.setUser(this);
        userForm.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_NGUOIDUNGMouseClicked
    

    // khi di chuột vào 
    private void NGUOIDUNGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NGUOIDUNGMouseEntered
        NGUOIDUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/NGUOIDUNG-HOVER.png")));
    }//GEN-LAST:event_NGUOIDUNGMouseEntered
    // khi di chuột ra
    private void NGUOIDUNGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NGUOIDUNGMouseExited
        NGUOIDUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/NGUOIDUNG.png")));
    }//GEN-LAST:event_NGUOIDUNGMouseExited

    // 
    private void LUACHONCUNGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LUACHONCUNGMouseClicked
        LUACHONCUNG luachoncungForm = new LUACHONCUNG();
        luachoncungForm.setLuaChonCung(this);
        luachoncungForm.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_LUACHONCUNGMouseClicked

    private void LUACHONCUNGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LUACHONCUNGMouseEntered
        LUACHONCUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/LUACHONCUNG-HOVER.png")));
    }//GEN-LAST:event_LUACHONCUNGMouseEntered

    private void LUACHONCUNGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LUACHONCUNGMouseExited
        LUACHONCUNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/LUACHONCUNG.png")));
    }//GEN-LAST:event_LUACHONCUNGMouseExited

    private void THOATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THOATMouseClicked
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_THOATMouseClicked

    private void THOATMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THOATMouseEntered
        THOAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/THOAT-HOVER.png")));
    }//GEN-LAST:event_THOATMouseEntered

    private void THOATMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THOATMouseExited
        THOAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/THOAT.png")));
    }//GEN-LAST:event_THOATMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LUACHONCUNG;
    private javax.swing.JLabel NGUOIDUNG;
    private javax.swing.JLabel THOAT;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menu;
    // End of variables declaration//GEN-END:variables
}
