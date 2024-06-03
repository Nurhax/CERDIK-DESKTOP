/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerdik.desktop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author KnightlyTech
 */
public class Apoteker extends Account implements SignUp,Displays{

    @Override
    public String Login(String Username, String Password) {
       try{
            Connection cariUsername = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = cariUsername.createStatement();
            String getUsernameQuery = "SELECT * FROM AKUN WHERE USERNAME = " + "'" + Username + "'";
            ResultSet result = statement.executeQuery(getUsernameQuery);
            result.first();
            
            if(result.getString("Password").equals(Password) && result.getString("Role").equals("APOTEKER")){
                return "PASIEN";
            }
            
            if(!result.getString("Password").equals(Password)){
                return "PASSWORD SALAH!";
            }
            
            cariUsername.close();
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
        
        return "PASSWORD ATAU USERNAME SALAH!";
    }

    @Override
    public void signUp(String Username, String Password, String Email) {
        int hasilCreate = createID();
        try{
            Connection signUp = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = signUp.createStatement();
            String DaftarQuery = "INSERT INTO AKUN(AccountID,Username,Password,Role,Email)  VALUES('"+hasilCreate+"','"+Username+"','"+Password+"','"+"APOTEKER"+"','"+Email+"')";
            statement.executeUpdate(DaftarQuery);
            statement.close();
            signUp.close();
            System.out.println("Pasien Berhasil Daftar!");
        }catch(Exception e){
            System.out.println("Error! " + e);
        }
    }

    @Override
    public ResultSet DisplayInfo(String Username) {
        try{
            Connection cariUsername = DriverManager.getConnection("jdbc:mysql://localhost/cerdik","root","");
            Statement statement = cariUsername.createStatement();
            String getUserInfo = "SELECT * FROM AKUN WHERE USERNAME = " + "'" + Username + "'";
            ResultSet result = statement.executeQuery(getUserInfo);
            result.first();
            return result;
        }catch(Exception e){
            System.out.println("Error!" + e);
        }
        
        return null;
    }
    
}
