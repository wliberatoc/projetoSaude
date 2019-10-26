/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Medico;

/**
 *
 * @author Willian
 */
public class DaoMedico {
    
    public void create(Medico m){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            System.out.println("ta quase");
            stmt = conn.prepareStatement("INSERT INTO `medico`(`nome`, `nascimento`, `endereco`, `telefone`, `email`, `crm`, `cpf`, `senha`)"
                    + " VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1,m.getNome());
            stmt.setString(2,m.getNascimento());
            stmt.setString(3,m.getEndereco());
            stmt.setString(4,m.getTelefone());
            stmt.setString(5,m.getEmail());
            stmt.setString(6,m.getCrm());
            stmt.setString(7,m.getCpf());
            stmt.setString(8,m.getSenha());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso","Consultório",1);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
        
    }//fim create
    
    public void update(Medico m){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            System.out.println("ta quase");
            stmt = conn.prepareStatement("UPDATE `medico` SET `nome` = ?, `nascimento` = ?, `endereco` = ?, "
                    + "`telefone` = ?, `email` = ?, `cpf` = ?, `crm` = ?, `senha` = ? WHERE `idMedico` = ?");
            stmt.setString(1,m.getNome());
            stmt.setString(2,m.getNascimento());
            stmt.setString(3,m.getEndereco());
            stmt.setString(4,m.getTelefone());
            stmt.setString(5,m.getEmail());
            stmt.setString(7,m.getCrm());
            stmt.setString(6,m.getCpf());
            stmt.setString(8,m.getSenha());
            
            stmt.setInt(9,m.getIdMedico());
            
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim update
    public void delete(Medico m){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM `medico` WHERE `idMedico` = ?");
            
            stmt.setInt(0,m.getIdMedico());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }    
    }//fim delete
    
}
