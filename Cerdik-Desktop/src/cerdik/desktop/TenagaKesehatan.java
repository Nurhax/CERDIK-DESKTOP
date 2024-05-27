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
public class TenagaKesehatan extends Account implements SignUp,Displays {
    private String Phone_Nakes;

    public String getPhone_Nakes() {
        return Phone_Nakes;
    }

    public void setPhone_Nakes(String Phone_Nakes) {
        this.Phone_Nakes = Phone_Nakes;
    }
    
    
    @Override
    public void Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DisplayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}