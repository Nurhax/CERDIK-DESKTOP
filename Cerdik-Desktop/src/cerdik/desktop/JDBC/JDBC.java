/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerdik.desktop.JDBC;

import guiApoteker.Jadwal;
import guiApoteker.Obat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author KnightlyTech
 */
public class JDBC {
    static final String DB_URL = "jdbc:mysql://localhost/CERDIK";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection connection;
    static Statement statement;
    static ResultSet results;
    
    
    public JDBC() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
     public void TestConnection() throws SQLException{
        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection Berhasil");
            connection.close();
        }catch (SQLException e){
            System.out.println("Connection gagal!");
        }
    }
     
     public List<Obat> getObatList() {
        List<Obat> obatList = new ArrayList<>();
        try {
            String query = "SELECT NAMA, JENIS,STOK FROM obat";
            results = statement.executeQuery(query);
            while (results.next()) {
                Obat obat = new Obat(results.getString("NAMA"), results.getString("JENIS"),results.getInt("STOK"));
                obatList.add(obat);
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return obatList;
    }
     public List<Jadwal> getJadwalList() {
        List<Jadwal> jadwalList = new ArrayList<>();
        try {
            String query = "select IDJadwal,IDPasien,IDObat,Gejala,Dosis,Start_Date,End_Date,IsConfirmedNakes,IsConfirmedApoteker,username from jadwal natural join akun;";
            results = statement.executeQuery(query);
            while (results.next()) {
                Jadwal jadwal = new Jadwal(results.getInt("IDPasien"), results.getInt("IDObat"),results.getString("Start_Date"),results.getString("End_Date"),results.getInt("IsConfirmedNakes"),results.getInt("IsConfirmedApoteker"));
                jadwal.setNamaPasien(results.getString("username"));
                
                jadwalList.add(jadwal);
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return jadwalList;
    }
    public Obat getObatDetails(String nama, String jenis) {
    Obat obat = null;
    try {
        String query = "SELECT NAMA, JENIS, STOK, `SARAN PENYAJIAN` FROM obat WHERE NAMA = ? AND JENIS = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, jenis);
        results = preparedStatement.executeQuery();
        if (results.next()) {
            obat = new Obat(results.getString("NAMA"), results.getString("JENIS"), results.getInt("STOK"));
            obat.setSaranPenyajian(results.getString("SARAN PENYAJIAN"));
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
    }
    return obat;
}
    public Jadwal getJadwalDetails(String startDate) {
    Jadwal jadwal = null;
    try {
        String query = "SELECT IDJadwal, IDPasien, IDObat, Gejala, Dosis, Start_date, End_Date, IsConfirmedNakes, IsConfirmedApoteker FROM jadwal WHERE Start_Date = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, startDate);
        results = preparedStatement.executeQuery();
        if (results.next()) {
            int idJadwal = results.getInt("IDJadwal");
            int idPasien = results.getInt("IDPasien");
            int idObat = results.getInt("IDObat");
            String gejala = results.getString("Gejala");
            String dosis = results.getString("Dosis");
            String start_date = results.getString("Start_date");
            String end_date = results.getString("End_Date");
            int isConfirmedNakes = results.getInt("IsConfirmedNakes");
            int isConfirmedApoteker = results.getInt("IsConfirmedApoteker");
            
            jadwal = new Jadwal( idPasien, idObat, start_date, end_date, isConfirmedNakes, isConfirmedApoteker);
        } else {
            System.out.println("No records found for Start Date: " + startDate);
        }
        preparedStatement.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
    }
    return jadwal;
    }
    
    public void approveJadwalNakes(Jadwal selectedJadwal) {
    String tanggal = selectedJadwal.getStart_Date();
    try {
        String query = "UPDATE jadwal SET IsConfirmedApoteker = 1, IsConfirmedNakes = 0 WHERE Start_Date = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, tanggal);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Jadwal successfully approved.");
        } else {
            System.out.println("No jadwal found with the given start date.");
        }
        preparedStatement.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
    }
}


}
    

