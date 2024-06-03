/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlvpp;

import Database.DBConnection;
import java.sql.Connection;

/**
 *
 * @author Peggy
 */
public class test {
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        Connection connection = db.GetConnection();
    }
}
