/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerdik.desktop.JDBC;

import java.sql.*;
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
    
    
     public void TestConnection() throws SQLException{
        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection Berhasil");
            connection.close();
        }catch (SQLException e){
            System.out.println("Connection gagal!");
        }
    }
     
    public int getIDFromDB(String Username) throws SQLException{
        try{
            Connection cariAccountID = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = cariAccountID.createStatement();
            String getIDQuery = "SELECT AccountID FROM AKUN WHERE USERNAME = " + "'" + Username + "'";
            ResultSet result = statement.executeQuery(getIDQuery);
            result.first();
            int hasilGetID = result.getInt("AccountID");
            
            
            if(hasilGetID == 0){
                cariAccountID.close();
                statement.close();
                return -1;
            }else{
                cariAccountID.close();
                statement.close();
                return hasilGetID;
            }
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
        return 0;
    }
    
    
     
    
}
