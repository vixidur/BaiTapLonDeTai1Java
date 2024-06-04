/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.mathangModel;
import Model.nhanvienModel;
import javax.swing.JTable;

/**
 *
 * @author Admin
 */
public class NhanVienController {

    private nhanvienModel nvModel;

    public NhanVienController() {
        this.nvModel = new nhanvienModel();
    }

    public void showNhanVienData(JTable tbl) {
        nvModel.show(tbl);
    }

    public boolean themNhanVien(String manv, String tennv, String dt, String pass) {
        return nvModel.addCustomer(manv, tennv, dt, pass);
    }

    public boolean suaNhanVien(String manv, String tennv, String dt, String pass) {
        return nvModel.editCustomer(manv, tennv, dt, pass);
    }

    public boolean xoaNhanVien(String manv) {
        return nvModel.delCustomer(manv);
    }

    public void timNhanVien(JTable tbl, boolean searchByName, String tenNV, boolean searchById, String maNV) {
        nvModel.searchNhanVien(tbl, searchByName, tenNV, searchById, maNV);
    }
}
