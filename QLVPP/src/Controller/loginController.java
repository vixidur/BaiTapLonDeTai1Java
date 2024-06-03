/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBConnection;
import Model.loginModel;
import Model.nhanvien;
import java.sql.*;

/**
 *
 * @author Peggy
 */
public class loginController {

    private loginModel nhanVienModel;

    public loginController() {
        this.nhanVienModel = new loginModel();
    }

    public nhanvien login(String username, String password) {
        return nhanVienModel.validate(username, password);
    }

}
