/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import views.InicioDeSesion;
import views.MenuAdministrador;

/**
 *
 * @author Cesar
 */
public class ControllerLogin {
    
    
    
    
    
    public void login (InicioDeSesion i, String username, String password){
      try{
        if (username.equalsIgnoreCase("admin")&&password.equals("admin123")) {            
                 // Inicio de sesión exitoso
                
                UIManager.put("OptionPane.okButtonText", "Continuar");
                JOptionPane.showMessageDialog(null, "Bienvenido/a admin al gestor del inventario de La Tiendita de Lupita");
                i.dispose();
                MenuAdministrador menu = new MenuAdministrador();
                menu.setVisible(true);

            } else {
            
                // Credenciales inválidas
                JOptionPane.showMessageDialog(null, "Credenciales Inválidas");
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error en la validación: " + e.getMessage());
            
        }
    }
    
  
}
