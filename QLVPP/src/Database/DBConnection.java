/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peggy
 */
public class DBConnection {
    String dbName = "qlvpp"; //tên cơ sở dữ liệu cần kết nối
    String connString = "jdbc:sqlserver://DESKTOP-BGVSI3B\\SQLEXPRESS:1433; databaseName=" + dbName + "; user=sa; password=Chienhpt102; encrypt=true;trustServerCertificate=true";

    public Connection GetConnection() {
        try {
            Connection conn;
            conn = DriverManager.getConnection(connString);
            System.out.println("03-Trần Văn Chiến: kết nối thành công");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet GetData(String query) {
        Connection conn = GetConnection();
        if (conn == null) //nếu không thể mở kết nối
        {
            CloseConnection(conn); //Đóng kết nối
            return null;
        }
        Statement stm;
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            CloseConnection(conn); //đóng kết nối
            return null;
        }
    }

    public boolean UpdateData(String query) {

        Connection conn = GetConnection();
        if (conn == null) {
            return false;
        }
        Statement stm;
        try {
            stm = conn.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void CloseConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {

            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
