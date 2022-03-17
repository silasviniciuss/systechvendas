/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author Silas Vinicius
 */
public class TestaConexao {
 
    public static void main(String[] args) {
        
        try {
            
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso");
            
        } catch (Exception erro) {
        
            JOptionPane.showMessageDialog(null,"Ops, aconteceu um erro: "+erro);
        
        }
        
    }
    
    
}
