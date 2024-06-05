/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.nhaphangModel;
import javax.swing.JComboBox;

/**
 *
 * @author Admin
 */
public class NhapHangController {

    private nhaphangModel nhModel;

    
    public NhapHangController(){
        this.nhModel = new nhaphangModel();
    }
    public boolean saveHoaDon(int sohoadon, String ngaynhap, String ncc, String mamathang, String tenmathang, int soluongN, double dongiaN) {
        return nhModel.luuHoaDon(sohoadon, ngaynhap, ncc, mamathang, tenmathang, soluongN, dongiaN);
    }

    public void getMaNCC(JComboBox cbNCC) {
        nhModel.updateMaNCCComboBox(cbNCC);
    }
}
