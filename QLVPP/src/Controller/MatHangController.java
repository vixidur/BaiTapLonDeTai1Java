/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.mathangModel;
import javax.swing.JTable;

/**
 *
 * @author Peggy
 */
public class MatHangController {

    private mathangModel matHangModel;

    public MatHangController() {
        this.matHangModel = new mathangModel();
    }

    public void showMatHangData(JTable tbl) {
        matHangModel.show(tbl);
    }

    public boolean themMatHang(String maMatHang, String tenMatHang, String donViTinh, String nhaSX, String chatLieu, String hinhAnhPath) {
        return matHangModel.addProduct(maMatHang, tenMatHang, donViTinh, nhaSX, chatLieu, hinhAnhPath);
    }

    public boolean suaMatHang(String maMatHang, String tenMatHang, String donViTinh, String nhaSX, String chatLieu, String hinhAnhPath) {
        return matHangModel.editProduct(maMatHang, tenMatHang, donViTinh, nhaSX, chatLieu, hinhAnhPath);
    }

    public boolean xoaMatHang(String maMatHang) {
        return matHangModel.delProduct(maMatHang);
    }
}
