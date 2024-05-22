/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerdik.desktop;

/**
 *
 * @author KnightlyTech
 */

public abstract class Account {
    private String Username;
    private String Password;
    private String ID;
    private String Role;
    
    public abstract void Login();
    //abstract method karena implementasi semua jenis role akan sama
    
}
