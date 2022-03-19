/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;
import projeto.model.Clientes;

/**
 *
 * @author Silas Vinicius
 */
public class ClientesDAO {
    
    //construtor
    private Connection con;
    public ClientesDAO(){
        this.con = new ConnectionFactory().getConnection();
    };
    
    //metodo cadastrar cliente
    public void cadastrarCliente(Clientes obj){
    
        try {
            //Comando sql
            String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            // Conectando com o banco de dados
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1,obj.getNome());
            stmt.setString(2,obj.getRg());
            stmt.setString(3,obj.getCpf());
            stmt.setString(4,obj.getEmail());
            stmt.setString(5,obj.getTelefone());
            stmt.setString(6,obj.getCelular());
            stmt.setString(7,obj.getCep());
            stmt.setString(8,obj.getEndereco());
            stmt.setInt(9,obj.getNumero());
            stmt.setString(10,obj.getComplemento());
            stmt.setString(11,obj.getBairro());
            stmt.setString(12,obj.getCidade());
            stmt.setString(13,obj.getUf());
            
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null,"Erro "+erro);
            
        }
        
    };
    
    
    //metodo alterar cliente
    public void alterarCliente(){
    
        
        
    };
    
    //metodo excluir cliente
    public void excluirCliente(){
    
        
        
    };
    
};
