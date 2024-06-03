/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Database.DBConnection;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Peggy
 */
public class mathangModel {

    public mathangModel() {
    }
    DBConnection dbCon = new DBConnection();

    public void show(JTable tbl) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "SELECT * FROM mathang";
            ResultSet resultSet = statement.executeQuery(sql);
            DefaultTableModel dtm = (DefaultTableModel) tbl.getModel();
            dtm.setRowCount(0);
            while (resultSet.next()) {
                Object obj[] = {
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6)
                };
                dtm.addRow(obj);
                tbl.setModel(dtm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean addProduct(String maMatHang, String tenMatHang, String donViTinh, String nhaSX, String chatLieu, String hinhAnhPath) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "INSERT INTO mathang (mamathang, tenmathang, donvitinh, nhasx, chatlieu, anh) VALUES ('" + maMatHang + "', N'"
                    + tenMatHang + "', '" + donViTinh + "', N'" + nhaSX + "', N'" + chatLieu + "', '" + hinhAnhPath + "')";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean editProduct(String maMatHang, String tenMatHang, String donViTinh, String nhaSX, String chatLieu, String hinhAnhPath) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "UPDATE mathang SET tenmathang = N'" + tenMatHang + "', donvitinh = '" + donViTinh + "', "
                    + "nhasx = N'" + nhaSX + "', chatlieu = N'" + chatLieu + "', "
                    + "anh = '" + hinhAnhPath + "' WHERE mamathang = '" + maMatHang + "'";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
