/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package View;

import Controller.MatHangController;
import Controller.NhapHangController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CAPNHATTHONGTINNHAPHANG extends java.awt.Frame {

    /**
     * Creates new form CAPNHATTHONGTINNHAPHANG
     */
    private MatHangController mhController;
    private NhapHangController nhController;
    private void addTableModelListenerToNhapHangTable() {
        ((DefaultTableModel) tblNhapHang.getModel()).addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 2 || e.getColumn() == 3) {
                    int row = e.getFirstRow();
                    DefaultTableModel model = (DefaultTableModel) tblNhapHang.getModel();
                    String soluongStr = (String) model.getValueAt(row, 2);
                    String dongiaStr = (String) model.getValueAt(row, 3);
                    if (soluongStr != null && !soluongStr.trim().isEmpty() && dongiaStr != null && !dongiaStr.trim().isEmpty()) {
                        double thanhTien = Integer.parseInt(soluongStr.trim()) * Double.parseDouble(dongiaStr.trim());
                        model.setValueAt(thanhTien, row, 4);
                        tinhTongCacHang();
                    }
                }
            }
        });
    }

    private void tinhTongCacHang() {
        DefaultTableModel model = (DefaultTableModel) tblNhapHang.getModel();
        double total = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double value = (double) model.getValueAt(i, 4);
            total += value;
        }
        txtTongTien.setText(String.valueOf(total));
    }

    public CAPNHATTHONGTINNHAPHANG() {
        initComponents();
        this.setLocationRelativeTo(null);
        addTableModelListenerToNhapHangTable();
        this.mhController = new MatHangController();
        this.nhController = new NhapHangController();
        mhController.showMatHangDataToTable(tblMatHang);
        nhController.getMaNCC(cbNCC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miXoa = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSoHoaDon = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        cbNCC = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhapHang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatHang = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        miXoa.setText("Xoá");
        miXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miXoaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miXoa);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CẬP NHẬT THÔNG TIN NHẬP HÀNG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("THÔNG TIN HOÁ ĐƠN NHẬP");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Số hoá đơn");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nhà cung cấp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ngày nhập");

        cbNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNCCActionPerformed(evt);
            }
        });

        jButton1.setText("LƯU HOÁ ĐƠN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("IN HOÁ ĐƠN");

        jButton3.setText("THOÁT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("THÔNG TIN MẶT HÀNG");

        tblNhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã mặt hàng", "Tên mặt hàng", "Số lượng nhập", "Đơn giá nhập", "Thành tiền"
            }
        ));
        tblNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblNhapHangMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhapHang);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("THÔNG TIN NHẬP HÀNG");

        jLabel8.setText("TỔNG TIỀN:");

        jLabel9.setText("Tên mặt hàng:");

        jButton4.setText("Tìm");

        tblMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã mặt hàng", "Tên mặt hàng", "Nhà sản xuất"
            }
        ));
        tblMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMatHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMatHang);

        jButton5.setText("CHỌN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(txtSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(423, 423, 423)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(267, 267, 267)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(34, 34, 34)
                                                .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(277, 277, 277)
                                .addComponent(jLabel6)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(cbNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        this.dispose();
    }//GEN-LAST:event_exitForm

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblMatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMatHangMouseClicked
        int selectedRow = tblMatHang.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            Object[] rowData = new Object[2];
            rowData[0] = tblMatHang.getValueAt(selectedRow, 0);
            rowData[1] = tblMatHang.getValueAt(selectedRow, 1);
            DefaultTableModel model = (DefaultTableModel) tblNhapHang.getModel();
            model.addRow(rowData);
        }
    }//GEN-LAST:event_tblMatHangMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblNhapHangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhapHangMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblNhapHangMouseReleased

    private void miXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miXoaActionPerformed
        int row = tblNhapHang.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblNhapHang.getModel();
            Object value = model.getValueAt(row, 4);
            if (value != null) {
                double thanhTienHienTai = (double) value;
                model.removeRow(row);
                capNhatTongTien(-thanhTienHienTai);
            }
        }
    }//GEN-LAST:event_miXoaActionPerformed

    private void hoaDonLuu() {
        String sohoadonStr = txtSoHoaDon.getText();
        int sohoadon = Integer.parseInt(sohoadonStr);
        String cbNhaCungCap = cbNCC.getSelectedItem().toString();
        String ngayNhap = txtNgayNhap.getText();
        int row = tblNhapHang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng trong bảng nhập hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Object maMatHang = tblNhapHang.getValueAt(row, 0); // mã mặt hàng
        Object tenMatHang = tblNhapHang.getValueAt(row, 1); // tên mặt hàng
        Object soLuong = tblNhapHang.getValueAt(row, 2); // số lượng nhập
        Object donGia = tblNhapHang.getValueAt(row, 3); // đơn giá nhập

        String mamh = maMatHang.toString();
        String tenmh = tenMatHang.toString();
        int sl = Integer.parseInt((String) soLuong);
        double dg = Double.parseDouble((String) donGia);
        boolean success = nhController.saveHoaDon(sohoadon, ngayNhap, cbNhaCungCap, mamh, tenmh, sl, dg);
        if (success) {
            JOptionPane.showMessageDialog(this, "Lưu hoá đơn thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Lưu hoá đơn thất bại!");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hoaDonLuu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNCCActionPerformed

    }//GEN-LAST:event_cbNCCActionPerformed
    private void capNhatTongTien(double amount) {
        String tongTienGanNhatStr = txtTongTien.getText();
        double tongTienGanNhat = Double.parseDouble(tongTienGanNhatStr);
        double tongTienMoi = tongTienGanNhat + amount;
        txtTongTien.setText(String.valueOf(tongTienMoi));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAPNHATTHONGTINNHAPHANG().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNCC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuItem miXoa;
    private javax.swing.JTable tblMatHang;
    private javax.swing.JTable tblNhapHang;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSoHoaDon;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
