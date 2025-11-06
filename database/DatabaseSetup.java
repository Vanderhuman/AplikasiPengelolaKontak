/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan.AplikasiPengelolaKontak.database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSetup {
 public static void main(String[] args) {
 String sql = "CREATE TABLE IF NOT EXISTS contacts ("
 + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
 + "nama TEXT NOT NULL,"
 + "nomor_telepon TEXT NOT NULL,"
 + "kategori TEXT"
 + ");";
 try (Connection conn = DatabaseConnection.getConnection();
 Statement stmt = conn.createStatement()) {
 stmt.execute(sql);
 System.out.println("Tabel 'contacts' berhasil dibuat atau sudah ada.");
 } catch (SQLException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}

