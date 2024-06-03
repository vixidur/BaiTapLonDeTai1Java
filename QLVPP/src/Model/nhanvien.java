/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Peggy
 */
public class nhanvien {

    private String manv;
    private String tennv;
    private String dienthoai;
    private String pass;

    public nhanvien(String manv, String tennv, String dienthoai, String pass) {
        this.manv = manv;
        this.tennv = tennv;
        this.dienthoai = dienthoai;
        this.pass = pass;
    }

    public String getManv() {
        return manv;
    }

    public String getTennv() {
        return tennv;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "NhanVien{"
                + "manv=" + manv
                + ", tennv='" + tennv + '\''
                + ", dienthoai='" + dienthoai + '\''
                + ", pass='" + pass + '\''
                + '}';
    }
}
