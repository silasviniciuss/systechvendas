/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;
import projeto.model.Clientes;
import java.sql.ResultSet;

/**
 *
 * @author Silas Vinicius
 */
public class ClientesDAO {

    //construtor
    private Connection con;

    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    ;
    
    //metodo cadastrar cliente
    public void cadastrarCliente(Clientes obj) {

        try {
            //Comando sql
            String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            // Conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro " + erro);

        }

    }

    ;
    
    
    //metodo alterar cliente
    public void alterarCliente() {

    }

    ;
    
    //metodo excluir cliente
    public void excluirCliente() {

    }

    ;
    
    //metodo listar todos os clientes
    public List<Clientes> listarCliente() {

        try {

            // Criando a lista
            List<Clientes> lista = new ArrayList<>();

            //Criando o comando sql, organizar e executar
            String sql = "select * from tb_clientes";

            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes obj = new Clientes();

                obj.setId(rs.getInt("Id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("Bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;

        }

    }
;

};
