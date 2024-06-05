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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class nhaphangModel {

    DBConnection dbCon = new DBConnection();

    public boolean luuHoaDon(int sohoadon, String ngaynhap, String ncc, String mamathang, String tenmathang, int soluongN, double dongiaN) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "BEGIN TRANSACTION;\n"
                    + "INSERT INTO hoadonnhap\n"
                    + "VALUES ('" + sohoadon + "','" + ngaynhap + "',  '" + ncc + "');\n"
                    + "INSERT INTO chitietnhap\n"
                    + "VALUES ('" + sohoadon + "', '" + mamathang + "', '" + soluongN + "', '" + dongiaN + "');\n"
                    + "COMMIT;";
            int rowsInserted = statement.executeUpdate(sql);
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
            return false;
        }
    }

    public void updateMaNCCComboBox(JComboBox<String> cbNCC) {
        try (Connection connection = dbCon.GetConnection(); Statement statement = connection.createStatement()) {
            String sql = "SELECT mancc FROM nhacungcap";
            ResultSet resultSet = statement.executeQuery(sql);
            cbNCC.removeAllItems();
            while (resultSet.next()) {
                String maNCC = resultSet.getString(1);
                cbNCC.addItem(maNCC);
            }
        } catch (SQLException e) {
            System.out.println("Debug: " + e.getMessage());
        }
    }

}
