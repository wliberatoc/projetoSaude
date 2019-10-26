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
import model.Atendente;

/**
 *
 * @author Willian
 */
public class DaoAtendente {
    public void create(Atendente a){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO `atendente`(`nome`, `nascimento`, `endereco`, `telefone`, `email`, `cpf`, `senha`)"
                    + " VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1,a.getNome());
            stmt.setString(2,a.getNascimento());
            stmt.setString(3,a.getEndereco());
            stmt.setString(4,a.getTelefone());
            stmt.setString(5,a.getEmail());
            stmt.setString(6,a.getCpf());
            stmt.setString(7,a.getSenha());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim create
    
    public void update(Atendente a){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("UPDATE `atendente` SET `nome` = ?, `nascimento` = ?, `endereco` = ?, "
                    + "`telefone` = ?, `email` = ?, `cpf` = ?, `senha` = ? WHERE `idAtendente` = ?");
            
            
            stmt.setString(1,a.getNome());
            stmt.setString(2,a.getNascimento());
            stmt.setString(3,a.getEndereco());
            stmt.setString(4,a.getTelefone());
            stmt.setString(5,a.getEmail());
            stmt.setString(6,a.getCpf());
            stmt.setString(7,a.getSenha());
           
            stmt.setInt(8,a.getIdAtendente());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim update
    
    public void delete(Atendente a){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM `atendente` WHERE `idAtendente` = ?");
            
            stmt.setInt(0,a.getIdAtendente());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim delete
}
