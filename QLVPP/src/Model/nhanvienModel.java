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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class nhanvienModel {

    DBConnection dbCon = new DBConnection();

    public void show(JTable tbl) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "SELECT * FROM nhanvien";
            ResultSet resultSet = statement.executeQuery(sql);
            DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
            dtm.setRowCount(0);
            while (resultSet.next()) {
                Object obj[] = {
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),};
                dtm.addRow(obj);
                tbl.setModel(dtm);
            }
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
        }
    }

    public boolean addCustomer(String maNV, String tenNV, String dienThoai, String pass) {
        if (checkTrungMa(maNV)) {
            return false;
        }
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "INSERT INTO nhanvien (manv, tennv, dienthoai, pass) VALUES ('" + maNV + "', N'"
                    + tenNV + "', '" + dienThoai + "', '" + pass + "')";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
            return false;
        }
    }

    public boolean editCustomer(String maNV, String tenNV, String dienThoai, String pass) {
        if (checkTrungMa(maNV)) {
            return false;
        }
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "UPDATE nhanvien SET tennv = N'" + tenNV + "', dienthoai = '" + dienThoai + "', "
                    + "pass = '" + pass + "' WHERE manv = '" + maNV + "'";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
            return false;
        }
    }

    public boolean delCustomer(String maNV) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "DELETE FROM nhanvien WHERE manv = '" + maNV + "'";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
            return false;
        }
    }

    public boolean checkTrungMa(String ma) {
        String query = "SELECT COUNT(*) FROM nhanvien WHERE ma = '" + ma + "'";
        try (Connection conn = dbCon.GetConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
        }
        return false;
    }

    public void searchNhanVien(JTable tbl, boolean searchByName, String tenNV, boolean searchById, String maNV) {
        String tim = "SELECT * FROM nhanvien WHERE 1=1"; // Start with a base query that is always true

        if (searchByName && !tenNV.isEmpty()) {
            tim += " AND tennv LIKE N'%" + tenNV + "%'";
        }
        if (searchById && !maNV.isEmpty()) {
            tim += " AND manv LIKE '%" + maNV + "%'";
        }

        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(tim);
            DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Object obj[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                dtm.addRow(obj);
            }
            tbl.setModel(dtm);
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
        }
    }
}
