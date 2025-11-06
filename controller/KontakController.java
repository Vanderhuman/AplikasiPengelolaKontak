/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan.AplikasiPengelolaKontak.controller;

import Latihan.AplikasiPengelolaKontak.model.Kontak;
import Latihan.AplikasiPengelolaKontak.model.KontakDAO;
import java.sql.SQLException;
import java.util.List;

public class KontakController {
  private final KontakDAO contactDAO;
public KontakController() {
 contactDAO = new KontakDAO();
}
// Method mengambil semua data kontak
public List<Kontak> getAllContacts() throws SQLException {
 return contactDAO.getAllContacts();
}
// Method menambah kontak
public void addContact(String nama, String nomorTelepon, String kategori)
throws SQLException {
 Kontak contact = new Kontak(0, nama, nomorTelepon, kategori);
 contactDAO.addContact(contact);
}
// Method mengupdate kontak
public void updateContact(int id, String nama, String nomorTelepon,
String kategori) throws SQLException {
 Kontak contact = new Kontak(id, nama, nomorTelepon, kategori);
 contactDAO.updateContact(contact);
}
// Method menghapus kontak
public void deleteContact(int id) throws SQLException {
 contactDAO.deleteContact(id);
}

// Method pencarian kontak
public List<Kontak> searchContacts(String keyword) throws SQLException {
 return contactDAO.searchContacts(keyword);
}
public boolean isDuplicatePhoneNumber(String nomorTelepon, Integer
excludeId) throws SQLException {
 return contactDAO.isDuplicatePhoneNumber(nomorTelepon, excludeId);
}
  
}
