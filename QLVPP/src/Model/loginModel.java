/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Peggy
 */
public class loginModel {

    DBConnection dbConn = new DBConnection();

    public nhanvien validate(String username, String password) {
        nhanvien nhanVien = null;
        try (Connection connection = dbConn.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "SELECT * FROM nhanvien WHERE manv = '" + username + "' AND pass = '" + password + "'";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                String manv = rs.getString("manv");
                String tennv = rs.getString("tennv");
                String dienthoai = rs.getString("dienthoai");
                String pass = rs.getString("pass");
                nhanVien = new nhanvien(manv, tennv, dienthoai, pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanVien;
    }

}
