/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Silas Vinicius
 */
public class Utilitarios {
    
    //metodo limparCampos
    public void LimpaTela(JPanel container){
    
        Component components[] = container.getComponents();
        for(Component component : components){
            if(component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
    }
    
    }
    
}
