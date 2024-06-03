/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Peggy
 */
public class mathang {

    private int maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private String nhaSX;
    private String chatLieu;
    private String hinhAnhPath;

    public mathang(int maMatHang, String tenMatHang, String donViTinh, String nhaSX, String chatLieu, String hinhAnhPath) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.nhaSX = nhaSX;
        this.chatLieu = chatLieu;
        this.hinhAnhPath = hinhAnhPath;
    }

    public int getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(int maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getHinhAnhPath() {
        return hinhAnhPath;
    }

    public void setHinhAnhPath(String hinhAnhPath) {
        this.hinhAnhPath = hinhAnhPath;
    }
}
